package com.rishabh.immutable;



public final class Person {
	private final int number;
	private final String name;
	private final Address address;
	
	public Person(int number, String name, Address address){
		this.number = number;
		this.name = name;
		this.address = new Address(address.getStreet());
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return new Address(address.getStreet());
	}
	
	
}

class New{
	public static void main(String args[]){
		String stree = "cosmos";
		Address add = new Address(stree);
		Person person = new Person(1, "Rishabh", add);
		System.out.println(person.getName());
		
		
		System.out.println(person.getAddress().getStreet());
		Address add1 = person.getAddress();
		 add1.setStreet("muno");
		 System.out.println(person.getAddress().getStreet());
		 
		 add.setStreet("newadd");
		 System.out.println(person.getAddress().getStreet());
		
		
	}
}
