package org.student;

import org.department.Department;

//studentName(),studentDept(),studentId()
public class Student extends Department	 {
	
	public void studentName()
	{
		System.out.println("Name:ABC");
	}
	
	public void studentDept()
	{
		System.out.println("Dept:CS");
	}

	public void studentId()
	{
		System.out.println("Id:1234");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.deptName();
		s.collegeName();
		s.collegeRank();
		s.collegeCode();
		

	}

}
