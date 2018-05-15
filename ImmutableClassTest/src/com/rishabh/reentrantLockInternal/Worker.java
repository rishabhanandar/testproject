package com.rishabh.reentrantLockInternal;

public class Worker implements Runnable{
	
	private Task task;
	public Worker(Task task){
		this.task = task;
	}
	
	public void run(){
		task.perform();
	}
}
