package com.ito.assignment.student_records;



 public class StudentId{
	String deptcode;
	int year;
	int id;
	public StudentId(String deptcode, int year, int id) {
		
		this.deptcode = deptcode;
		this.year = year;
		this.id = id;
		
	}
	public String toString() 
    { 
        return "[" + year + " " + deptcode + " " + id + "]"; 
    } 	
}
