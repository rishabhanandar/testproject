package com.bajra.program;

public class Course implements Cloneable{

	String sub1;
	String sub2;
	
	public Course(String sub1, String sub2){
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
