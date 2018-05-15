package com.bajra.reentrantLock;

public class PrintOddEven {
	private static Integer counter  = 1;

	public static void main(String[] args) {
		new EvenThread().start();
		new OddThread().start();

	}
	
	public static class EvenThread extends Thread{

		@Override
		public void run(){
			synchronized(counter){
			while(counter<10){
				
					if(counter %2 == 0){
						try {
							Thread.sleep(1000);
							System.out.println("Hola EVEN!!" + counter);
							counter++;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	public static class OddThread extends Thread{

		@Override
		public void run(){
			synchronized(counter){
			while(counter<10){
				
					if(counter %2 == 1){
						try {
							Thread.sleep(1000);
							System.out.println("Hola ODD!!" + counter);
							counter++;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	

}
