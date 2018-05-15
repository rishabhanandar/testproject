import com.rtg.rishabh.EOCCommadLineModule;
import com.rtg.rishabh.ModuleMapping;


public class Main {
	

	public static void main(String[] args) {
		String arguments1 = "";
		try{
		if(args !=null){
		 arguments1 = args[0];
		 System.out.println(arguments1);
		 EOCCommadLineModule eOCCommadLineModule = EOCCommadLineModule.getEOEocCommadLineModuleInstance();
		 eOCCommadLineModule.setArguments1(arguments1);
		 ModuleMapping moduleMapping = new ModuleMapping();
		 moduleMapping.mapToDiffModules();
		}
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//String arguments2 = args[1];
		
		
			
			
	}

}
