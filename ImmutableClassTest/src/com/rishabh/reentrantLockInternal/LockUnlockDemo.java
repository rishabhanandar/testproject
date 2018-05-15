package com.rishabh.reentrantLockInternal;

import java.util.concurrent.locks.ReentrantLock;

public class LockUnlockDemo implements Task{
	
	final ReentrantLock reentrantLock = new ReentrantLock(true);
	

	@Override
	public void perform() {
		System.out.println(Thread.currentThread().getName() + " : trying to acquire lock");
		reentrantLock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " : acquired lock");
			//while(true){
				//System.out.println("deadlock");
				Thread.sleep(0);
			//}
		
		//System.out.println("performing task");
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println(Thread.currentThread().getName() + " : released lock");
			reentrantLock.unlock();
		}
	}

}
