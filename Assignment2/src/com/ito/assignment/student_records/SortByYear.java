package com.ito.assignment.student_records;


	import java.util.Comparator;

	public class SortByYear implements Comparator<StudentId>
	{
		
		public int compare(StudentId o1, StudentId o2) {
			Integer year1 = o1.year;
			int year2 = o2.year;
			return year1.compareTo(year2);
		}
	}

