package com.bajra.program;

public class MySingleton {
	private volatile static MySingleton INSTANCE;

	private MySingleton(){

	}

	public static MySingleton getInstance(){

		if(INSTANCE == null){
			synchronized(MySingleton.class){
				if(INSTANCE == null){
					INSTANCE = new MySingleton();
				}
			}
		}
		return INSTANCE;

	}

}
