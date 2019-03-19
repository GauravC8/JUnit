package com.niit.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SuiteTest1
{
	public String message="Gaurav";
	JUnitMessage junitMessage=new JUnitMessage (message);
	
	

	@Test//(expected=ArithmeticException.class)
	public void testJUnitMessage()
	{
		System.out.println("JUnit message is printing");
		junitMessage.printMessage();
	}
	
	@Test
	public void testJUnitHiMessage()
	{
		message="Hi" + message;
		System.out.println("JUnit hi message is printing");
		assertEquals(message,junitMessage.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	}
	

}
