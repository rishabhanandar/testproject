package com.bajra.program;

import java.util.HashMap;
import java.util.TreeMap;

class A
{
    int i = 10;
    protected int temp = 50;
    A(){
    	System.out.println("Super");
    }
    
}
 
/*class B extends A
{
    int i = 20;
    void print(){
    	System.out.println("Hola");
    }
}*/


 
public class HelloWorld
{
	static void swap(int x, int y){
		int temp =x;
		x = y;
		y = temp;
	}
	
	/*public static boolean m1(String input){
		
		if(input == null){
			
			return false;
		}
		int len = input.length();
		if(len <2)
			return true;
		char[] chars = input.toCharArray();
		int j = len-1;
		for(int i=0; i<len/2; ++i, j--){
			
			if(chars[i] != chars[j-i]){
				return false;
			}
		}
		
		return true;
	} */

	
	int i = 20;
	
	void B(){
		System.out.println("Inside B");
	}
	/*{
	System.out.println(a.i);
	}*/
	/*{
		System.out.println("Instance Block");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	public HelloWorld() {
		//super();
		System.out.println("Constructor");
	}
	
	void print(){
    	System.out.println("HolaChild");
    }*/
	
	public static void main(String[] args)
    {
		        
        /*final Thread t2 = new Thread("t2"){
        	public void run(){
        		System.out.println("Inside T2");
        		try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        	}
        };
        
        Thread t1 = new Thread("t1"){
        	public void run(){
        		System.out.println("Inside T1");
        		t2.start();
        		t2.interrupt();
        		
        	}
        };
        
        t1.start();*/
		
		int a = 10;
		int b = 20;
		swap(a, b);
        System.out.println(a + " " + b);

		
		
		//HelloWorld helloWorld =  new HelloWorld();
		//System.out.println(helloWorld.i);
		
		//System.out.println(m1("ABBA"));
		
		/*HelloWorld helloWorld =  new HelloWorld();
		
		//A a = helloWorld;
		
		//HelloWorld hh = (HelloWorld)a;
		
		//A aa = new HelloWorld();
		helloWorld.print();*/
		
		/*List<String> list = new ArrayList<String>(Arrays.asList("aa", "bb"));
		list.add("aa");
		list.add("a");
		
		Iterator<String> itrr = list.iterator();
		while(itrr.hasNext()){
			itrr.next();
			//list.add("a");
			list.remove("a");
			//itrr.remove();
		}
		
		System.out.println(list.size());*/
		
		/*List<String> myList = new ArrayList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println("List Value:"+value);
		     myList.remove(0);
		}*/
		
		/*List<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("3");
		//myList.add("3");
		for(String ss: myList){
			myList.remove(ss);
		}*/
		
		/*TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>();
		
		//TreeMap<Student, String> treeSTMap = new TreeMap<Student, String>();
		//Student std = new Student(1, null);
		
		Employee student1  = new Employee(1, 10, "KHN");
		//Employee student2  = new Employee(1, 10, "KHN");
		
		treeMap.put(student1, "Student1");
		
		treeMap.put(student1, "Student2");
		//treeSTMap.put(std, "Tre11");
		//treeMap.put(student2, "Student2");
		//treeMap.put(student1, "Student3");
		
		System.out.println("Student Hashcode "+ student1.hashCode());
		//System.out.println("Student Hashcode "+ student2.hashCode());
		
		System.out.println("Fetching Student1 Details " + treeMap.get(new Employee(1, 10, "KHN")));*/
		//System.out.println("Fetching Student1 Details From Std Treemap " + treeSTMap.get(new Student(1, null)));
		//System.out.println("Fetching Student2 Details " + treeMap.get(student1));
		
    }
}