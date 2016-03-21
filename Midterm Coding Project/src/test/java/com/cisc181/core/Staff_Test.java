package com.cisc181.core;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;
//**JM**//
public class Staff_Test {
	static Staff Staff1;
	static Staff WbirStaff;
	static Staff WnumStaff;
	static Staff Other;
	static Staff Others;
	static ArrayList<Staff> staff;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() {
		staff = new ArrayList<Staff>();
		Staff1 = new Staff("First", "Middle", "last", 
				new Date(), "Address", "(123)-654-7891", 
				"123 Road", "staff@email.com", 
				0, 40000.0, null, eTitle.MR);
		WbirStaff= new Staff("Wrong", "Birth", "Date", 
				new Date(), "Address", "(800)-588-2300", 
				"789 lane", "staff@email.com", 0, 50000, 
				null, null);
		WnumStaff= new Staff("Wrong", "Num", "Ber", 
				new Date(), "Address", "(333)-444-5555", 
				"1 street", "staff@email.com", 0, 60000, 
				null, null);
		Other = new Staff("Jonn", "Martian", "Jonz", 
				new Date(), "Address", "(696)-696-6969", 
				"76 pike", "staff@email.com", 0, 70000, 
				null, null);
		Others = new Staff("Bruce", "Thomas", "Wayne", 
				new Date(), "Address", "(610)-666-6666", 
				"987 ext.", "staff@email.com", 0, 80000, 
				null, null);
		staff.add(Staff1);
		staff.add(WbirStaff);
		staff.add(WnumStaff);
		staff.add(Other);
		staff.add(Others);
		
		double Average=(Staff1.getSalary()+
				WbirStaff.getSalary()+WnumStaff.getSalary()
				+Other.getSalary()+Others.getSalary())/5;
		assertEquals(Average,60000);
	}
	@Test
	public void test() {
		double invalidPhone=0;
		Staff WnumStaff=new Staff(null);
		try {
			WnumStaff.setPhone("4884300");
		} catch (PersonException e) {
			invalidPhone=1;
		}
	}
	@Test
	public void oldTest() throws PersonException{
		Calendar newCal=Calendar.getInstance();
		newCal.set(Calendar.YEAR, 1888);
		Date newDate= newCal.getTime();
		WbirStaff.setDOB(newDate);
	}

}
