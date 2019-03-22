package com.niit.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MyMathTest {
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	MyMath myMath = new MyMath();
	@Test
	public void sum_with3number(){
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1number()
	{
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
