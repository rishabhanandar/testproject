package com.rtg.rishabh;

public class ModuleMapping {
  public void mapToDiffModules(){
	  EOCCommadLineModule eOCCommadLineModule = EOCCommadLineModule.getEOEocCommadLineModuleInstance();
	  if(eOCCommadLineModule == null){
		  System.out.println("value is null");
	  }
	  System.out.println("eco module argument is"+eOCCommadLineModule.getArguments1());
	  if(eOCCommadLineModule.getArguments1().equals("Event")){
			System.out.println("event method is called");
		}
		else if(eOCCommadLineModule.getArguments1().equals("Collection")){
			System.out.println("Collection method is called");
		}
		else if(eOCCommadLineModule.getArguments1().equals("")){
			System.out.println("Please enter a value");
		}
		else{
			System.out.println("please pass a variable");
		}
  }
}
