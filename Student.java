package org.student;

import org.department.Department;

public class Student extends Department{
     public void studentName() {
    	 System.out.println("Student Name is Ayisha");
     }
     public void StudentDpt() {
    	 System.out.println("Student department is CSE");
     }
     public void studentId() {
    	 System.out.println("Student id is 11420");
    	 
     }
	public static void main(String[] args) {
		
		Student object=new Student();
		object.collegeName();
		object.collegeCode();
		object.collegeRank();
		object.departmentName();
		object.studentName();
		object.StudentDpt();
		object.studentId();

	}

}
