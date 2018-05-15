package com.rishabh.Lock;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintingQueue {
	private final Lock lock = new ReentrantLock();
	
	public void printJob(Object document){
		lock.lock();
		Long duration = (long) (Math.random() * 1000);
		System.out.println(Thread.currentThread().getName()+" PrintingQueue : Printing a Job during :"+duration/1000 + " seconds :: Time - " + new Date());
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
