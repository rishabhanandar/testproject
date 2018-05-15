package com.bajra.reentrantLock;

public class Print3StringsAlternatively {

	private static final Object LOCK = new Object();
	static boolean isT1 = true;
	static boolean isT2 = false;
	static boolean isT3 = false;
	
	public static void main(String[] args) {
		
		PrintThread p1 = new PrintThread("A", 1);
		PrintThread p2 = new PrintThread("B", 2);
		PrintThread p3 = new PrintThread("C", 3);
		
		new Thread(p1, "T1").start();;
		new Thread(p2, "T2").start();
		new Thread(p3, "T3").start();
		
	}
	
	static class PrintThread implements Runnable{
		String tName;
		int tID;
		
		public PrintThread(String tName, int tID){
			this.tName = tName;
			this.tID = tID;
		}

		@Override
		public void run() {
			
				synchronized(LOCK){
					for(int i=0;i < 10; i++){
					try {
						if(tID == 1){
							if(!isT1){
								LOCK.wait();
							}else{
								System.out.println(Thread.currentThread().getName() + " executing " + tName);
								isT1 = false;
								isT2 = true;
								isT3 = false;
								LOCK.notifyAll();
							}
						}
						if(tID == 2){
							if(!isT2){
								LOCK.wait();
							}else{
								System.out.println(Thread.currentThread().getName() + " executing " + tName);
								isT1 = false;
								isT2 = false;
								isT3 = true;
								LOCK.notifyAll();
							}
						}
						if(tID == 3){
							if(!isT3){
								LOCK.wait();
							}else{
								System.out.println(Thread.currentThread().getName() + " executing " + tName);
								isT1 = true;
								isT2 = false;
								isT3 = false;
								LOCK.notifyAll();
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}
