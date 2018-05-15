package com.bajra.reentrantLock;

public interface BlockingQueueCustom<E> {
	
	public void put(E e) throws InterruptedException;
	
	public E take() throws InterruptedException;
	
	public int size();

}
