package com.rtg.rishabh;

public class EOCCommadLineModule {
	private static EOCCommadLineModule eOCCommadLineModule;
	private EOCCommadLineModule() {
	}
	public static EOCCommadLineModule getEOEocCommadLineModuleInstance(){
		
		if(eOCCommadLineModule != null){
			return eOCCommadLineModule;
		}
		else
		{
			return new EOCCommadLineModule();
		}
		
		
	}
	private String arguments1;
	
	public String getArguments1() {
		return arguments1;
	}
	public void setArguments1(String arguments1) {
		this.arguments1 = arguments1;
		System.out.println(this.arguments1);
	}
	
	}
