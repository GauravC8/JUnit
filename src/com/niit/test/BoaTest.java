package com.niit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BoaTest {

	Boa jen;
	Boa ken;

	@Before
	public void setUp() throws Exception {
		jen = new Boa("Jennifer", 2, "grapes");
		ken = new Boa("Kenneth", 3, "granola bars");

	}

	@Test
	public void isHealthy() {
		assertEquals(ken.isHealthy(), true);
		assertEquals(jen.isHealthy(), false);
	}

	@Test
	public void testFitsInCage() {
		assertEquals(jen.fitsInCage(1), false);
		assertEquals(ken.fitsInCage(4), true);
		assertEquals(jen.fitsInCage(3), true);
		assertEquals(ken.fitsInCage(2), false);
	}

	@Test
	public void lengthInInches() {
		assertEquals(jen.lengthInInches(), 24);
		assertEquals(ken.lengthInInches(), 36);
	}

}
