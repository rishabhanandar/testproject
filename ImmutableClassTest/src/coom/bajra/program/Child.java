package com.bajra.program;

import java.io.IOException;

class Parent {

	public int value = 10;
	
	void test() throws Exception{
		System.out.println("Parent");
	}
}

public class Child extends Parent{
	
	public int value = 20;
	public int testValue = 20;
	
	void test()throws IOException{
		System.out.println("Child");
	}
	
	public static void main(String[] args) throws Exception {
		
		Parent p = new Child();
		
		Child ch2 = (Child) p;
		//Child ch = (Child) new Parent();
		Child ch = (Child)ch2;
		
		p.test();
		ch.test();
	}
}

