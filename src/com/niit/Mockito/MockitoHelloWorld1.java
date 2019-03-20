package com.niit.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MockitoHelloWorld1 {

	private Demo1 d;
	
	@Before
	public void setupMock()
	{
		d=mock(Demo1.class);
		when(d.greet()).thenReturn(Demo1.HELLO_WORLD); 
	}
	
	@Test
	public void fooGreets()
	{
		System.out.println("Foo greests: " + d.greet());
		assertEquals("Hello World",d.greet());
	}
	
	@Test
	public void barGreets()
	{
		Bar bar=new Bar();
		assertEquals("Hello World",bar.greet(d));
		
	}
	

}
/*
Bar.java
Demo1.java
MockitoHelloWorld1.java*/
