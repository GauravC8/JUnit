package com.niit.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Spy;

public class MockitoSpyMethodExample {

	@Spy
	List<String> spyOnList;
	@Test
	public void test()
	{
		List<String> list  =new ArrayList<>();
		spyOnList =spy(list);
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10, spyOnList.size());
		
		//calling real method since below methods are not stubbed
		spyOnList.add("Parul");
		spyOnList.add("Ravina");
		assertEquals("Parul", spyOnList.get(0));
		assertEquals("Ravina", spyOnList.get(1));
		System.out.println(spyOnList.get(0));
		System.out.println(spyOnList.get(1));
		
	}
}
