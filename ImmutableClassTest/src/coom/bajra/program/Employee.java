package com.bajra.program;

public class Employee /*implements Comparable<Employee>*/{

	private int id;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;;
	}
	private int age;
	public int getAge() {
		return age;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}*/

	public Employee(int id, int age, String name){
		this.id = id;
		this.age = age;
		this.name = name;
	}

	/*@Override
	public int compareTo(Employee emp) {
		return this.id - emp.id;
	}*/
	
	public String toString(){
		return "ID is- " + id + "Age is- " + age + "Name is- " + name;
	}
}
