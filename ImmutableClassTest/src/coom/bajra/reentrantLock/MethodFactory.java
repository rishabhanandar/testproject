package com.bajra.reentrantLock;

public class MethodFactory {
	
	public void first(){
		System.out.println(Thread.currentThread().getName() + " executing 1st method!!");
	}
	
	public void second(){
		System.out.println(Thread.currentThread().getName() + " executing 2nd method!!");
	}
	
	public void third(){
		System.out.println(Thread.currentThread().getName() + " executing 3rd method!!");
	}

}
