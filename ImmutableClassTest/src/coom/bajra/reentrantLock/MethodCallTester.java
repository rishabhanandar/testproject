package com.bajra.reentrantLock;

public class MethodCallTester {
	
	private static MethodFactory methodFactory = new MethodFactory();
	private static boolean isM1 = true;
	private static boolean isM2 = false;
	private static boolean isM3 = false;
	

	public static void main(String[] args) {
		
		MethodRunnable methodRun1 = new MethodRunnable(1);
		MethodRunnable methodRun2 = new MethodRunnable(2);
		MethodRunnable methodRun3 = new MethodRunnable(3);
		
		new Thread(methodRun1, "First").start();
		new Thread(methodRun2, "Second").start();
		new Thread(methodRun3, "Third").start();
		
	}
	
	static class MethodRunnable implements Runnable{
		
		private int threadId;
		
		public MethodRunnable(int threadId){
			this.threadId = threadId;
		}

		@Override
		public void run() {
			
			while(true){
				synchronized(methodFactory){
					try{
						//Thread.sleep(500);
						if(threadId == 1){
							if(!isM1)
								methodFactory.wait();
							else{
							methodFactory.first();
							isM1 = false;
							isM2 = true;
							isM3 = false;
							methodFactory.notifyAll();
							}

						}if(threadId == 2){

							if(!isM2)
								methodFactory.wait();
							
							else{
							methodFactory.second();
							isM1 = false;
							isM2 = false;
							isM3 = true;
							methodFactory.notifyAll();
							}

						}if(threadId == 3){

							if(!isM3)
								methodFactory.wait();
							else{
							methodFactory.third();
							isM1 = true;
							isM2 = false;
							isM3 = false;
							methodFactory.notifyAll();
							}

						}
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
