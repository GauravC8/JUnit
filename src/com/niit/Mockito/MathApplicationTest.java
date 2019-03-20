package com.niit.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //impt to use @mock
public class MathApplicationTest {

	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAdd()
	{
		//add the behaviour of calc service to add number
		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
		
		//test the add functionality
		assertEquals(mathApplication.add(10.0, 20.0), 30.0,0);
		
		// verify call to calcService is made or not with same arguments
		verify(calcService).add(10.0,20.0);	
	}
/*	@Test
	public void testMultiply()
	{
		//add the behaviour of calc service to add number
		when(calcService.multiply(10.0, 20.0)).thenReturn(200.00);
		
		//test the add functionality
		assertEquals(mathApplication.multiply(10.0, 20.0), 200.0,0);
		
		//verify the behavior
		verify(calcService).multiply(10.0,20.0);	
	}*/
}


/*
CalculatorService.java interface
MathApplication.java class
MathApplicationTest.java Junitclass*/