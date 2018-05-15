package com.bajra.reentrantLock;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PracticeTreadPool {
	private int nThreads;
	private PoolWorker[] worker;
	private BlockingQueue queue;
	
	public void PracticeThreadPool(int nThreads){
		this.nThreads = nThreads;
		queue = new LinkedBlockingQueue();
		worker = new PoolWorker[nThreads];
		for(int i=0;i<nThreads;i++){
			new Thread(worker[i]).start();
		}
	}
	
	public void execute(Runnable task){
		synchronized (queue) {
			queue.add(task);
			queue.notifyAll();
		}
	}
	
	class PoolWorker implements Runnable{
		Runnable task;
		@Override
		public void run() {
			synchronized (queue) {
				if(queue.isEmpty()){
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			task = (Runnable) queue.poll();
			try {
				task.run();
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
		
	}

}
