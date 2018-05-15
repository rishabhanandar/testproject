package com.rishabh.Lock;

public class PrinterJob implements Runnable{
	
	PrintingQueue printingQueue;
	
	public void PrinterJob(PrintingQueue printingQueue){
		this.printingQueue = printingQueue;
	}
	
	public void run(){
		System.out.println("Going to print a document "+ Thread.currentThread().getName());
		printingQueue.printJob(new Object());
	}

}
