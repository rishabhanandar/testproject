package com.bajra.program;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String args[]) throws InterruptedException
    {
        // Let us create task that is going to wait for four
        // threads before it starts
        CountDownLatch latch = new CountDownLatch(4);
 
        // Let us create four CLWorker threads and start them.
        CLWorker first = new CLWorker(1000, latch, "CLWorker-1");
        CLWorker second = new CLWorker(6000, latch, "CLWorker-2");
        CLWorker third = new CLWorker(3000, latch, "CLWorker-3");
        CLWorker fourth = new CLWorker(4000, latch, "CLWorker-4");
        //fourth.start();
        first.start();
        second.start();
        third.start();
        fourth.start();
 
        // The main task waits for four threads
        latch.await();
 
        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                           " has finished");
    }
}
