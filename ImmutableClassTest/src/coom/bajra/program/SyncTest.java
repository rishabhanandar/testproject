package com.bajra.program;

public class SyncTest {
	
	private String name;
	
	public SyncTest(String name){
		this.name  = name;
	}
	
	public static synchronized void staticSync(){
		System.out.println("SM1 ");
		System.out.println("SM2 ");
	}
	
	public synchronized void Sync(){
		System.out.println(name  + "M1 ");
		System.out.println(name  + "M2 ");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		final SyncTest o1 =  new SyncTest("01");
		
		Thread t1 = new Thread(){
			
			@Override
			public void run(){
				o1.Sync();
			}
		};
		
		Thread t2 = new Thread(){
			
			@Override
			public void run(){
				staticSync();
			}
		};
		
		Thread t3 = new Thread(){
			
			@Override
			public void run(){
				staticSync();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
	}

}
