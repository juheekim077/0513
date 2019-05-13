package org.zerock.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int count = 0;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {

    }

    
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service...........................");
		System.out.println("service...........................");
		System.out.println("service...........................");
		System.out.println("service...........................");
		
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}


	@Override
	public void init() throws ServletException {
	  	System.out.println("init.......................1");
        System.out.println("init.......................1");
        System.out.println("init.......................1");
        System.out.println("init.......................1");
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
	       	System.out.println("init.......................2");
	        System.out.println("init.......................2");
	        System.out.println("init.......................2");
	        System.out.println("init.......................2");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		++count;
//		response.getWriter().append("Served at: ").append("" +count);
		
		String name = request.getParameter("name");
		
		System.out.println(name);
		
		response.setContentType("text/html; charset=UTF-8");
	
		response.getWriter().print(name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
