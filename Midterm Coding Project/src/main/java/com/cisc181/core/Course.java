package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;
//**Joaquin Martinez CISC181 MidtermCode**/
public class Course {
	private String CourseName;
	private UUID CourseID;
	private int GradePoints;
	private eMajor Major;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName=courseName;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID=courseID;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints=gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major=major;
	}
}
