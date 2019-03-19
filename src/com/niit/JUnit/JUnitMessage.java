package com.niit.JUnit;

public class JUnitMessage {
String m;

public JUnitMessage(String m) {
	super();
	this.m = m;
}
public String printMessage()
{
	return m;
}
public String printHiMessage()
{
	return "Hi"+ m;
}
}
