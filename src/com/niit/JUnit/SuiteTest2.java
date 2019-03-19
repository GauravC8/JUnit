package com.niit.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class SuiteTest2 {

	@Test
	public void createAndSetname()
	{
		String actual="y";
		String expected="y";
		
		Assert.assertEquals(expected, actual);
		System.out.println("Suite Test2 is successful " + actual);
	}

}
