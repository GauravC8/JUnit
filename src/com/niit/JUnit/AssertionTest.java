package com.niit.JUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testAssert()
	{
		String string1 ="Junit";
		String string2 ="Juni";
		String string3 ="test";
		String string4 ="test";
		String string5 = null;
		
		int variable1=1;
		int variable2=2;
		
		int[] arithmaticArray1 = {1,2,3};
		int[] arithmaticArray2 = {1,2,3};
		
		assertEquals(string1, string2);
		assertSame(string3, string4);
		assertNotSame(string1, string3);
		assertNotNull(string1);
		assertNotNull(string5);
		assertTrue(variable1<variable2);
		assertArrayEquals(arithmaticArray1, arithmaticArray2);
	}

}
