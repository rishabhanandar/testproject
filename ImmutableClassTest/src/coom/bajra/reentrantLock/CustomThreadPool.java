package com.bajra.reentrantLock;

public class CustomThreadPool {
	
	private BlockingQueueCustom<Runnable> taskQueue;
	private boolean poolShutdownInitiated = false;
	
	public CustomThreadPool(int nThread){
		taskQueue = new LinkedBlockingQueueCustom<Runnable>(nThread);
		for(int i=0;i < nThread; i++){
			ThreadPoolThread threadPoolThread = new ThreadPoolThread(taskQueue, this);
			threadPoolThread.setName("HolaThread- " + i);
			System.out.println("HolaThread- " + i + "starting..");
			threadPoolThread.start();
		}
	}
	
	public synchronized void execute(Runnable task) throws InterruptedException{
		if(this.poolShutdownInitiated){
			throw new InterruptedException("Threadpool has been shutdown. No more task will be accepted");
		}
		System.out.println("Task has been added");
		taskQueue.put(task);
	}
	
	public boolean isPoolShutdownInitiated(){
		return poolShutdownInitiated;
	}
	
	public synchronized void shutDown(){
		this.poolShutdownInitiated = true;
		System.out.println("Threadpool shutdown initiated");
	}
	
	
}
