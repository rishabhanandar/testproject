package com.bajra.reentrantLock;



public class OrderTest {
	private static final Object LOCK = new Object();
	static boolean isT1 = true;
	static boolean isT2 = false;

	public static void main(String[] args) throws InterruptedException {
		PrintThread print1 = new PrintThread("A", 1);
		PrintThread print2 = new PrintThread("B", 2);
		
		new Thread(print1, "First").start();
		new Thread(print2, "Second").start();
	}
	
	static class PrintThread implements Runnable{
		
		String printStr = "";
		int threadID;
		
		
		PrintThread(String printStr, int threadID){
			this.printStr = printStr;
			this.threadID = threadID;
		}

		@Override
		public void run() {
			for(int i=0;i<10;i++){
			synchronized(LOCK){
				try{
				if(threadID == 1){
					if(!isT1){
						LOCK.wait();
					}else{
						System.out.println(Thread.currentThread().getName() + " executing : "+ printStr);
						isT2= true;
						isT1=false;
						LOCK.notifyAll();
					}
				}
				if(threadID == 2){
					if(!isT2){
						LOCK.wait();
					}else{
						System.out.println(Thread.currentThread().getName() + " executing : "+ printStr);
						isT1= true;
						isT2=false;
						LOCK.notifyAll();
					}
				
					
				}
			}
			catch(InterruptedException e){
				
			}
		}//
		}
		
	}
	}
}
