package com.niit.Mockito;

public class Bar {

	public String greet(Demo1 d)
	{
		System.out.println("Bar Invokes Demo1.java");
		return d.greet();
	}
}


/*
Bar.java
Demo1.java
MockitoHelloWorld1.java*/