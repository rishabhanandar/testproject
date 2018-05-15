package com.rishabh.synchronisation;

public class ObjectLevelLocking {
	public static void main(String args[]){
		System.out.println();
	}
}

class ObjectLevelLockingExample{
	public  synchronized void demoMethod(){
		System.out.println("this is method level object locking");
	}
}

class ObjectLevelLockingExample2{
	public void demoMethod1(){
		synchronized(this){
			System.out.println("this is method level object locking 1");
		}
	}
}

class ObjectLevelLockingExample3{
	private final Object lock = new Object();
	public void demoMethod2(){
		synchronized(lock){
			System.out.println("this is method level object locking 2");
		}
	}
}

