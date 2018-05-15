package com.rishabh.reentrantLockInternal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://www.concretepage.com/java/reentrantlock-java-example-with-lock-unlock-trylock-lockinterruptibly-isheldbycurrentthread-and-getholdcount
public class Main {
	public static void main(String args[]){
	
		final int count = 5;
		ExecutorService service = Executors.newFixedThreadPool(count);
		
		Task task = new LockUnlockDemo();
		for(int i=0;i<5;i++){
			/*service.execute(new Worker(task));
			service.execute(new Runnable(){
				public void run(){
					task.perform();
				}
			});*/
			
			
			service.execute(() -> {
				task.perform();
			});
		}
	}
}
