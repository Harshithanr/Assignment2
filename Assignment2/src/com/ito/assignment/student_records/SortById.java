package com.ito.assignment.student_records;

import java.util.Comparator;

public class SortById implements Comparator<StudentId> {
		
		public int compare(StudentId o1, StudentId o2) {
			Integer id1=o1.id;
			int id2=o2.id;
			
			return id1.compareTo(id2);
		}

	
}

	
