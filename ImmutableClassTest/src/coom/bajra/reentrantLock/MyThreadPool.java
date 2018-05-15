package com.bajra.reentrantLock;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool<T> {

	private final int totalThreads;
	private final BlockingQueue<T> blockingQueue;
	private final PoolWorker[] poolWorker;
	
	public MyThreadPool(int totalThreads){
		this.totalThreads = totalThreads;
		blockingQueue = new LinkedBlockingQueue<T>();
		poolWorker = new PoolWorker[totalThreads];
		for(int i=0;i < totalThreads ;i++){
			poolWorker[i].start();
		}
	}
	
	public void execute(T task){
		synchronized(blockingQueue){
			blockingQueue.add(task);
			blockingQueue.notify();
		}
	}
	
	private class PoolWorker<T> extends Thread{
		public void run(){
			java.lang.Runnable task;
			while(true){
				synchronized(blockingQueue){
					if(blockingQueue.size() == 0){
						try {
							blockingQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					task = (Runnable) blockingQueue.poll();
					
				}
				
				try {
					((PoolWorker) task).run();
				} catch (RuntimeException  e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
