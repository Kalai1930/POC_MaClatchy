package com.memCacheDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.MemCache.Pojo.Student;
import com.jdbcConnection.DBConnection;

public class StudentDAO {
	
	static Connection con = null;
	Statement stat = null;
	Student stu = null;
	ResultSet rs = null;
	
	public StudentDAO() throws SQLException{
		con= DBConnection.getConnection();
		stat = con.createStatement();
	}
	
	public void addStudentDetails(String firstName,String lastName,String dob,String gender) throws SQLException, ParseException{
		
		
		 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	        Date parsed =  format.parse(dob);
	       java.sql.Date date = new java.sql.Date(parsed.getTime());

		String sql = "insert into Students (FristName,LastName,DOB,Gender,Address_key) values ('"+firstName+"','"+lastName+"',"
				+ "'"+date+"','"+gender+"',1)";
		System.out.println(sql);
		int check = stat.executeUpdate(sql);
		if(check > 0){
		System.out.println("Student details updated : "+firstName);
		}
	}
	public Student getStudentDetails(Student stu) throws SQLException{
		String sql = "Select * from Students where FristName='"+stu.getFirstName()+"'";
		rs = stat.executeQuery(sql);
		while(rs.next()){
			stu = new Student(rs.getInt("RollNo"),rs.getString("FristName"),rs.getString("LastName"),rs.getDate("DOB"),rs.getString("Gender"),rs.getInt("Address_key"));
		}
		
		return stu;
	}
	

}
