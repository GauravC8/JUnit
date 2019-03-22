package com.niit.Mockito;

public class StudentCheck {
	// private StudentDao studDAO = null;
	StudentDao std=new StudentDao();
	    public Student getDetails(String rollNo) throws Exception{
	        System.out.println("Before DB Call");
	        Student stud = std.getStudentDetails(rollNo);
	        System.out.println("After DB Call");
	        return stud;
	    }
	    public void setStudDAO(StudentDao studDAO){
	        this.std = studDAO;
	    }
}