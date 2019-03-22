package com.niit.Mockito;

import java.sql.*;
public class StudentDao {

    public Student getStudentDetails(String rollNo) throws Exception{
        System.out.println("Actual DB call will occur......");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
        PreparedStatement ps = con.prepareStatement("select * from Student where rollno=?");
        Student stud = new Student();
        ps.setString(1,rollNo);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            stud.setRollno(rs.getString("rollno"));
            stud.setFirstname(rs.getString("firstname"));
            stud.setLastname(rs.getString("lastname"));
            stud.setDept(rs.getString("dept"));
        }
        return stud;
    }
}