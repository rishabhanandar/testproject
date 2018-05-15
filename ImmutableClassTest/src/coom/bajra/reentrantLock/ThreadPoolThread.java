package com.bajra.reentrantLock;

public class ThreadPoolThread extends Thread{
	private BlockingQueueCustom<Runnable> taskQueue;
	private CustomThreadPool threadPool;
	
	public ThreadPoolThread(BlockingQueueCustom<Runnable> taskQueue, CustomThreadPool threadPool){
		this.taskQueue = taskQueue;
		this.threadPool = threadPool;
	}
	
	public void run(){
		
		try {
			while(true){
				System.out.println(Thread.currentThread().getName() + " is ready to execute task.");
		
				Runnable runnableTask =  taskQueue.take();
				System.out.println(Thread.currentThread().getName() + " has taken task.");
				
				runnableTask.run();
				System.out.println(Thread.currentThread().getName() + " has executed task.");
				
				if(threadPool.isPoolShutdownInitiated() && this.taskQueue.size() == 0){
					this.interrupt();
					Thread.sleep(1);
				}
				
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" has been STOPPED.");
		}
	}

}
