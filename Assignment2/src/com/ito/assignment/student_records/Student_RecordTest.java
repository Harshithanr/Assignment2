package com.ito.assignment.student_records;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class Student_RecordTest {

	
	@Test
	void test1() {
		
		TreeMap<StudentId, StudentDetail> details = Student_Record.studentdetails();
		assertEquals("[2019 ISE 2]", details.firstKey().toString());
	}
	
	@Test
	void test2() {
		
		TreeMap<StudentId, StudentDetail> details = Student_Record.studentdetails();
		assertEquals("[2018 ECE 10]", details.lastKey().toString());
	}
	
	@Test
	void test3() {
		
		TreeMap<StudentId, StudentDetail> details = Student_Record.studentdetails();
		assertFalse(details.isEmpty());
	}
	
	
}
