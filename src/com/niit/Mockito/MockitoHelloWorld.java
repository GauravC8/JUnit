package com.niit.Mockito;

import org.junit.Test;

import static com.niit.Mockito.Demo1.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoHelloWorld {

	@Test
	public void demoGreets() {
		Demo1 d = mock(Demo1.class); //Create mock demo object
		when(d.greet()).thenReturn(HELLO_WORLD); //adding Behaviour
		System.out.println("Demo Greets: "+ d.greet());
		assertEquals(d.greet(),HELLO_WORLD);
	}
}
