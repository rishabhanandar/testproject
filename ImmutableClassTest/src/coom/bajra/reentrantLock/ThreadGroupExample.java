package com.bajra.reentrantLock;

public class ThreadGroupExample {

	/*public static class MyThreadGroup extends ThreadGroup {
		 
        public MyThreadGroup(String s) {
            super(s);
        }
 
        public void uncaughtException(Thread thread, Throwable throwable) {
            System.out.println("Thread " + thread.getName() 
              + " died, exception was: ");
            throwable.printStackTrace();
        }
    }
 
    public static ThreadGroup workerThreads = 
      new MyThreadGroup("Worker Threads");*/
 
    public static class WorkerThread extends Thread {
        public WorkerThread(String s) {
            super(new ThreadGroup("Worker Group"){
            	public void uncaughtException(Thread thread, Throwable throwable) {
                    System.out.println("MyThread " + thread.getName() 
                      + " died, exception was: ");
                    throwable.printStackTrace();
                }
            }, s);
        }
 
        public void run() {
            String str = null;
            str.charAt(8);
        }
 
    }
 
    public static void main(String[] args) {
        Thread t = new WorkerThread("Worker Thread");
        t.start();
    }
}
