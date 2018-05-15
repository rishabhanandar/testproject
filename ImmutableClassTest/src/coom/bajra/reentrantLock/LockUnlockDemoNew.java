package com.bajra.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class LockUnlockDemoNew{
	
	final ReentrantLock reentrantLock = new ReentrantLock();	
	
	//final ReentrantLock reentrantLock1 = new ReentrantLock();
	
	
	public void performTask() {
	    reentrantLock.lock();
	    try { 
	    	 System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
	    	 System.out.println("Processing...");
	    	 performTask2();
	    	 //System.out.println((String)null);
	    	 Thread.sleep(2000);
	    } catch (InterruptedException e) {
	         e.printStackTrace();
	    } finally {
	    	 System.out.println(Thread.currentThread().getName() + ": Lock released.");
		 reentrantLock.unlock();
            }
	}
	
	public void performTask2() {
	    reentrantLock.lock();
	    try { 
	    	 System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
	    	 System.out.println("Processing Task2...");
	    	 //System.out.println((String)null);
	    	 Thread.sleep(2000);
	    } catch (InterruptedException e) {
	         e.printStackTrace();
	    } finally {
	    	 System.out.println(Thread.currentThread().getName() + ": Lock released.");
		 reentrantLock.unlock();
            }
	}
	
	public static void main(String[] args) {
		final LockUnlockDemoNew lockUnlockDemoNew = new LockUnlockDemoNew();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				lockUnlockDemoNew.performTask();
				
			}
		}).start();;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				lockUnlockDemoNew.performTask2();
				
			}
		}).start();;
	}
	

}
