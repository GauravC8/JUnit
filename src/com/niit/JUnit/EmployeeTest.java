package com.niit.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest()
	{
		String name="Gaurav";
		assertEquals(name,Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myObjectEqualsTest()
	{
		Employee obj=new Employee(1,"Gaurav",600000);
		assertEquals(obj,Employee.getHighestPaidEmployee());
	}
	
	
}
