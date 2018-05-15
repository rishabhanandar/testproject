package com.bajra.reentrantLock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

public class Test implements Serializable{
	
	{
		System.out.println(2);
	}
	
	static{
		System.out.println(1);
	}
	
	public Test(){
		System.out.println(3);
	}
	
	public static void main(String[] args)  {
		
		Test t  = new Test();
		
	}
	}


