package com.ito.assignment.overlapping_dates;



import java.time.LocalDate;
import java.time.Month;


public class UserInterface {
		public static void main(String[] args) throws UserException {
			DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.MARCH, 30));
			DateBand db2 = new DateBand(LocalDate.of(2020, Month.MARCH, 20), LocalDate.of(2020, Month.MARCH, 31));
			DateBand db = new DateBand();
			DateBand db4 = db.findOverlappingBand(db1, db2);
			System.out.println(db4);

		}

	}

	




