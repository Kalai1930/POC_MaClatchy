package com.memChacheServlet.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.memCacheDAO.StudentDAO;

/**
 * Servlet implementation class MemCacheServlet
 */

public class MemCacheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAO stuDAO = null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemCacheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			stuDAO = new StudentDAO(); 
			stuDAO.addStudentDetails(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("dob"),request.getParameter("gender"));
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
