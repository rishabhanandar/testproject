package com.bajra.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndoRedoArray {

	private List<Integer> currentValues;
    private int version = 0;
    private int highestVersion = 0;
    private Map<Integer, List<Integer>> history = new HashMap<Integer,List<Integer>>();

    public Integer[] getValues() {
        return (Integer[]) getCurrentValues().toArray();
    }

    private List<Integer> getCurrentValues() {
        if (currentValues == null) {
            currentValues = new ArrayList<Integer>();
        }
        return currentValues;
    }

    private void add(Integer[] newValues) {
        incrementHistory();
        getCurrentValues().addAll(Arrays.asList(newValues));
    }

    private void incrementHistory() {
        if (history.get(version) != null)  {
            throw new IllegalArgumentException("Cannot change history");
        }
        history.put(version,getCurrentValues());
        if (version > 2) {
            history.remove(version - 2);
        }
        version++;
        if (version > highestVersion) {
            highestVersion = version;
        }
    }

    private void delete(Integer[] endValues) {
        incrementHistory();
        int currentLength = getCurrentValues().size();
        int i = endValues.length-1;
        for (int deleteIndex = currentLength - 1; deleteIndex > currentLength - endValues.length; deleteIndex--) {
            if (!endValues[i].equals(getCurrentValues().get(deleteIndex))) {
                throw new IllegalArgumentException("Cannot delete element(" + endValues[i] + ") that isn't there");                
            }
            getCurrentValues().remove(deleteIndex);
        }
    }

    public void undo() {
       version--;
       if (history.get(version) == null) {
           throw new RuntimeException("Undo operation only supports 2 undos");
       }
       this.currentValues = history.get(version);
    }

    public void redo() {
       version++;
       if (history.get(version) == null) {
           throw new RuntimeException("Redo operation only supported after undo");
       }
       this.currentValues = history.get(version);
    }
}
