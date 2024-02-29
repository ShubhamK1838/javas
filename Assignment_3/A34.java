package sources;

//4) Write a Servlet program to check that life cycle methods are called by
//web container

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/A14")
public class A34 extends GenericServlet {

	public void init(ServletConfig config)
	{

		System.out.println("User Request...."); 
	}
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		res.getWriter().print("Service Invoked...");
		
	}
	
	public ServletConfig getServletConfig()
	{
		return null; 
	}
	
	public void destroye()
	{
		System.out.println("User Request Fulfilled...."); 
	}
	
	
	

}
