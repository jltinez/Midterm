package com.cisc181.core;
//**JM**//
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
public class Student_Test {

	@BeforeClass
	public static void setup() {
	ArrayList<Course>Courses=new ArrayList();
	
	Course Stats= new Course();
	UUID ABC=UUID.randomUUID();
	Stats.setCourseID(ABC);
	Stats.setCourseName("CHEM101");
	Stats.setGradePoints(4);
	Stats.setMajor(eMajor.CHEM);
	
	Course Orgo=new Course();
	UUID OI
	
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}