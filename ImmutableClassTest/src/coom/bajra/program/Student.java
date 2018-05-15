package com.bajra.program;

public class Student {

	 int studentID;
	 Course course;
	
	public Student(int studentID, Course course){
		this.studentID = studentID;
		this.course = course;
	}
	
	/*protected Object clone() throws CloneNotSupportedException{
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + studentID;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (studentID != other.studentID)
			return false;*/
		return true;
	}
	
	
}
