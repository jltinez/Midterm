package com.cisc181.core;
import java.util.Date;
import java.util.UUID;
//**JM**/
public class semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	public semester() {
	}
	public semester(UUID semesterID, Date startDate, Date endDate) {
		super();
		SemesterID=semesterID;
		StartDate=startDate;
		EndDate=endDate;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID=semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate=startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate=endDate;
	}
	

}
