package com.bajra.reentrantLock;

public class MyTask implements Runnable{

	private int num;
	
	public MyTask(int num){
		this.num = num;
	}
	@Override
	public void run() {
		System.out.println("task  " + num + " is running.");
		
	}

}
