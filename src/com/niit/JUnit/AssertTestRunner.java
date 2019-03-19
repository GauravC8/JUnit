package com.niit.JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertTestRunner {

	public static void main(String[] args) {
		Result result =JUnitCore.runClasses(AssertionTest.class);
		for(Failure failure :result.getFailures())
			System.out.println(failure.toString());
		
		System.out.println("Result=="+result.wasSuccessful());
	}
	
}
