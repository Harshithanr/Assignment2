package com.ito.assignment.student_records;

import java.util.Map;
import java.util.TreeMap;

public class Student_Record {
	
	static TreeMap<StudentId, StudentDetail> sd= new TreeMap<StudentId, StudentDetail>(new SortById());
	public static TreeMap<StudentId, StudentDetail> studentdetails(){
		
		StudentId student1 = new StudentId("CSE", 2019, 8);
		StudentId student2 = new StudentId("ISE", 2019, 2);
		StudentId student3 = new StudentId("ECE", 2018, 10);
		StudentId student4 = new StudentId("ME", 2017, 5);
		StudentId student5 = new StudentId("ENV", 2016, 6);
	
		sd.put(student1, new StudentDetail(student1, "Ranjitha", "N R", 22, "CSE", "BE"));
		sd.put(student2, new StudentDetail(student2, "Kavitha", "S", 20, "ISE", "BE"));
		sd.put(student3, new StudentDetail(student3, "Roopa", "shetty", 22, "ECE", "BE"));
		sd.put(student4, new StudentDetail(student4, "poorvitha", "S", 19, "ME", "BE"));
		sd.put(student5, new StudentDetail(student5, "Ranjitha", "G", 21, "ENV", "BE"));
		
		
		return sd;

	}
	public static void main(String[] args) {
		Student_Record.studentdetails();
		System.out.println("StudentId \t StudentDetails");
		for (Map.Entry<StudentId, StudentDetail> lm : sd.entrySet()) {
			System.out.println(lm.getKey()+" : "+lm.getValue());
			System.out.println();
		}
	}

}