package com.bajra.prodconsumer;

public class TestDeadLock {
	String str1 = "AIF";
	String str2 = "WSF";
	
	Thread t1 = new Thread("Thread1"){
		public void run(){
			for(int i=1; i<=3;i++){
				synchronized(str1){
					synchronized(str2){
						System.out.println(Thread.currentThread().getName() + " Hoaaaa!!"+ str1+str2);
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread("Thread2"){
		public void run(){
			for(int i=1; i<=3;i++){
				synchronized(str1){
					synchronized(str2){
						System.out.println(Thread.currentThread().getName() + " Hoaaaa!!"+ str1+str2);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		TestDeadLock testDeadLock = new TestDeadLock();
		
		testDeadLock.t1.start();
		testDeadLock.t2.start();

		testDeadLock.t1.join();
		testDeadLock.t2.join();
		
		
		/*List<?>[] intPairArr = new ArrayList<?>[10] ; // 
		intPairArr[0] = new ArrayList<String>();
		intPairArr[1] = new ArrayList<Integer>();
		for(List<?> item: intPairArr){
			System.out.println(item);
		}
		
		List<Object> objPairArr = new ArrayList<Object>() ; // 
		
		List<String> wildcardType = new ArrayList<String>();
		wildcardType=new ArrayList<String>();
		
		intPairArr[0] = new ArrayList<String>();
		intPairArr[1] = new ArrayList<Integer>();
		for(List<?> item: intPairArr){
			System.out.println(item);
		}*/
		System.out.println("Exiting main Thread!!");
	}

}
