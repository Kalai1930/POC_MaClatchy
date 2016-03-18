package com.memChacheServlet.project;

import java.io.IOException;
import java.sql.SQLException;

import com.MemCache.Pojo.Student;
import com.memCacheDAO.StudentDAO;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;

public class StudentMemCache {

	Student student = new Student();
	MemcachedClient memcachedClient;
	StudentDAO stuDAO = null;
	long start,elapsed;
	public Student getStuObj(Student stu) throws SQLException{
		
        try {
               memcachedClient = new MemcachedClient(AddrUtil.getAddresses("127.0.0.1:11211"));
               System.out.println("After Add : " + memcachedClient.get("Student"));
               start = System.currentTimeMillis();
               student = (Student) memcachedClient.get("Student");
               elapsed = System.currentTimeMillis() - start;
             
              if(stu.getFirstName() == stu.getFirstName()){
            	  System.out.println("Time taken to get the value from memCache: " + elapsed);
            	  return student;
              }
              else{
            	  start = System.currentTimeMillis();
            	  stuDAO = new StudentDAO(); 
            	  student = stuDAO.getStudentDetails(stu);
            	  elapsed = System.currentTimeMillis() - start;
            	  memcachedClient.add("Student", 1, student);
            	  System.out.println("Time taken to get the value from DB: " + elapsed);
              }
               
            memcachedClient.shutdown();
	}
        catch(IOException e){
        	e.printStackTrace();
        }
        return student;
	}
}
