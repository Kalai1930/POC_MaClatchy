package com.memChacheServlet.project;

import java.io.IOException;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;

public class SampleMemcache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemcachedClient memcachedClient;
        try {
               memcachedClient = new MemcachedClient(AddrUtil.getAddresses("127.0.0.1:11211"));
            //Add
               memcachedClient.add("FirstCaching", 1, "Test");
               //Get
               System.out.println("After Add : " + memcachedClient.get("FirstCaching"));
               //Set or Modify
               memcachedClient.set("FirstCaching", 1, "Sample Test");
               //Get
               System.out.println("After Set : " + memcachedClient.get("FirstCaching"));
               //Delete
               memcachedClient.delete("FirstCaching");
               //Get
               System.out.println("After Delete : " + memcachedClient.get("FirstCaching"));
            memcachedClient.shutdown();
        } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
        }
	}

}
