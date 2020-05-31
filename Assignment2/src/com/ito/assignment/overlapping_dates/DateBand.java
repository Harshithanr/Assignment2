package com.ito.assignment.overlapping_dates;


import java.time.LocalDate;

public class DateBand {

	public LocalDate startDate;
	public LocalDate endDate;
	public DateBand(LocalDate startDate,LocalDate endDate) {
		super();
		this.startDate=startDate;
		this.endDate=endDate;
	}
	LocalDate finalStart;
	LocalDate finalEnd;
	public DateBand() {}
	public DateBand findOverlappingBand(DateBand db1, DateBand db2) throws UserException{
		
		if(db1.endDate.compareTo(db1.startDate) < 0 || db2.endDate.compareTo(db2.startDate) < 0) {
			System.out.println("Not possible to compare, end date must be greater than start date");
			return null;
		} else if(db2.startDate.compareTo(db1.endDate) > 0) {
			throw new UserException("NoOverlappingBandFound");
		} else {
			int startDifference = db1.startDate.compareTo(db2.startDate);
			int endDifference = db1.endDate.compareTo(db2.endDate);
			if(startDifference < 0) {
				finalStart = db2.startDate;
				if(endDifference < 0) {
					finalEnd = db1.endDate;
				} else {
					finalEnd = db2.endDate;
				}
			} else {
				finalStart = db1.startDate;
				if(endDifference < 0) {
					finalEnd = db1.endDate;
				} else {
					finalEnd = db2.endDate;
				}
			}
			DateBand db3 = new DateBand(finalStart, finalEnd);
			return db3;	
		}
	}
	@Override
	public String toString() {
		return "DateBand [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}