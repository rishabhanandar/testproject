package com.bajra.prodconsumer;

import java.util.Iterator;
import java.util.TreeSet;

public abstract class ProducerConsumerBlockingQueue {
	
	private void getm(){
		System.out.println("Parent");
	}

	public static void main(String[] args) throws InterruptedException {/*
		BlockingQueue<Message> sharedQueue = new LinkedBlockingQueue<Message>();
	    
	     ProducerBQ producer=new ProducerBQ(sharedQueue, new Message(""));
	     ConsumerBQ consumer=new ConsumerBQ(sharedQueue, new Message(""));
	    
	     Thread producerThread = new Thread(producer, "ProducerThread");
	     Thread consumerThread = new Thread(consumer, "ConsumerThread");
	     producerThread.start();
	     consumerThread.start();
	     
	     //consumerThread.join();
	     System.out.println("Done bhai!!");

	*/
		TreeSet t  =  new TreeSet();
		
		t.add("One");
		t.add("Two");
		t.add("One");
		t.add(null);
Iterator it =t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
	}

}
