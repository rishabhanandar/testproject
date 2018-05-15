package com.rishabh.singletondemo;

public class Singleton {
	
	private static Singleton soleInstance = new Singleton();
	private Singleton(){
		System.out.println("creating constructor");
	}
	
	public static Singleton getInstance(){
		return soleInstance;
	}
	
	
}

class SingletonTest{
	public static void main(String args[]){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
	}
}

