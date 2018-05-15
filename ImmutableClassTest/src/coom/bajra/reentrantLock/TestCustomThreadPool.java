package com.bajra.reentrantLock;

import java.util.ArrayList;
import java.util.List;

public class TestCustomThreadPool {

	public static void main(String[] args) throws InterruptedException {
		
		CustomThreadPool customThreadPool  = new CustomThreadPool(2);
		Runnable runnable = new CustomTask();
		
		customThreadPool.execute(runnable);
		customThreadPool.execute(runnable);
		
		customThreadPool.shutDown();
		
		/*List<Object> listOfObject = new ArrayList<Object>();
		List<String> listOfString = new ArrayList<String>();

		List<?> listofAny = new ArrayList<>();
		listOfObject.add("ss");
		listOfObject.add(123);
		
		String str = (String) listOfObject.get(1);
		
		Object[] objArr = new Long[1];
		objArr[0] = "hhh";
		
		List<Object>  objList = new ArrayList<Object>();*/
	}

}
