package com.bajra.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SwallowDeepCopyTest {

	public static void main(String[] args) {
		/*Course course = new Course("PHY", "MATHS");
		Student student = new Student(100, course);
		
		Student studentClone = null;
		
		try {
			studentClone = (Student) student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(student.course.sub2);
		
		studentClone.course.sub2 = "BIO";
		
		System.out.println(student.course.sub2);*/
		
		//Comparable-- Comparator
		
		/*ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, 20, "Gyanesh"));
		empList.add(new Employee(2, 10, "Gyanesh"));
		empList.add(new Employee(3, 30, "Gyanesh"));
		
		Collections.sort(empList);
		System.out.println(empList.toString());
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println(empList);*/
		
		
		HashMap<Student, String> map = new HashMap<Student, String>();
		//Student student = new Student(1, null);
		map.put(new Student(1, null), "1st");
		map.put(new Student(2, null), "2nd");
		map.put(new Student(3, null), "3rd");
		
		System.out.println("Size is: " + map.size());
		
		/*List<Object> listOfObject = new ArrayList<Object>();
		
		List listOfObject1 = new ArrayList();
		
		listOfObject.add("jj");
		listOfObject.add(12);
		
		listOfObject.get(0);*/
		
		/*HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add(null);
		set.add(null);
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}*/
		
	}

}
