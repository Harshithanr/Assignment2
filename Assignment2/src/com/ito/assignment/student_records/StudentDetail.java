package com.ito.assignment.student_records;



public class StudentDetail {

	public StudentId studentId;
	public String firstName;
	public String lastName;
	public int age;
	public String deptName;
	public String courseName;
	
	public StudentDetail(StudentId studentId, String firstName, String lastName, int age, String deptName,
			String courseName) {
		
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.deptName = deptName;
		this.courseName = courseName;
	}

	
	public String toString() {
		return "[" + studentId + " " + firstName + " " + lastName
				+ " " + age + " " + deptName + " " + courseName + "]";
	}
}