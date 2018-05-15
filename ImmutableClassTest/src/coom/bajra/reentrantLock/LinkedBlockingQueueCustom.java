package coom.bajra.reentrantLock;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueueCustom<E> implements BlockingQueueCustom<E>{
	
	private List<E> taskQueue;
	private int maxSize;
	
	public LinkedBlockingQueueCustom(int maxSize) {
		taskQueue = new LinkedList<E>();
		this.maxSize = maxSize;
	}

	@Override
	public synchronized void put(E e) throws InterruptedException {
		if(taskQueue.size() == maxSize){
			this.wait();
		}
		taskQueue.add(e);
		this.notifyAll();
			
	}

	@Override
	public synchronized E take() throws InterruptedException {
		if(taskQueue.size() == 0){
			this.wait();
		}
		this.notifyAll();
		return taskQueue.remove(0);
	}

	@Override
	public synchronized int size() {
		return taskQueue.size();
	}

}
