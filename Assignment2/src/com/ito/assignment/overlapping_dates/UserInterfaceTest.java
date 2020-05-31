package com.ito.assignment.overlapping_dates;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserInterfaceTest {

	@Test
	void test() throws Exception {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db3 = db.findOverlappingBand(db1, db2);
		assertEquals(LocalDate.of(2020, Month.JANUARY, 15), db3.startDate);
	}
	
	@Test
	void test3() throws Exception {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 31), LocalDate.of(2020, Month.JANUARY, 1));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db3 = db.findOverlappingBand(db1, db2);
		assertNull(db3);
	}
	
	@Test
	public void RaiseAnException() throws UserException {
	    Assertions.assertThrows(UserException.class, () -> {
	    	DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 15));
			DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 16), LocalDate.of(2020, Month.FEBRUARY, 20));
			DateBand db = new DateBand();
			DateBand db3 = db.findOverlappingBand(db1, db2);
	    });
	}

}
