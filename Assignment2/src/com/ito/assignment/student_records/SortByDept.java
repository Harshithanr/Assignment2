package com.ito.assignment.student_records;

import java.util.Comparator;

public class SortByDept implements Comparator<StudentId> {
	
SortById id= new SortById();
	
	
	public int compare(StudentId o1, StudentId o2) {
		String dept1=o1.deptcode;
		String dept2=o2.deptcode;
		if(dept1==dept2) {
			return id.compare(o1,o2);
		}else
		
		return dept1.compareTo(dept2);
	}
}
