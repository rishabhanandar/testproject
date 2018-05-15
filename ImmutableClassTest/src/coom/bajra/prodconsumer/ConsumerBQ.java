package com.bajra.prodconsumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerBQ implements Runnable{
	
	Message message;
	private BlockingQueue<Message> sharedQueue;
	 
    public ConsumerBQ (BlockingQueue<Message> sharedQueue,Message message) {
        this.sharedQueue = sharedQueue;
        this.message = message;
    }
 
    @Override
    public void run() {
        while(!(sharedQueue.isEmpty()) || sharedQueue.poll().toString().equals("Exit")){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
         } catch (InterruptedException ex) {
             
         }
        }
    }

}
