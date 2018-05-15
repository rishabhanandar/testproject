package com.bajra.prodconsumer;

import java.util.concurrent.BlockingQueue;

public class ProducerBQ implements Runnable{
	
	Message message;
	private final BlockingQueue<Message> sharedQueue;
	 
    public ProducerBQ(BlockingQueue<Message> sharedQueue, Message message) {
        this.sharedQueue = sharedQueue;
        this.message = message;
    }
 
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(message);          
         } catch (InterruptedException ex) {
             
         }
        }
        
        try {
			sharedQueue.put(new Message("Exit"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
