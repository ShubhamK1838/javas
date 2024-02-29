package sources;


import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * 7) Write a program to create Servlet to demonstrate Login and Logout
using HttpSession interface.
 */
@WebServlet("/A17")
public class A37 extends HttpServlet {
	
	
	public void doPost(HttpServletRequest  s, HttpServletResponse r) throws IOException 
	{
		PrintWriter say=r.getWriter(); 
		String user=s.getParameter("user_name").toString(); 
		String pass=s.getParameter("user_pass").toString(); 
		s.getSession().setAttribute("user", user);
		String out="Hello" ; 
		if(say.equals("sk") && pass.equals("jadoo"))
		{	
			
			r.sendRedirect("one.jsp"); 
			
		}else 
		{
			say.println("Enter Your Valid Username and password ");
		}
		
		
	}

}

/*
 * index.hmtl
 * <form method="post" action="A17"> 
	
		<input type="text" name="user_name"> 
		<BR> 
		<input type="text" name="user_pass" > 
		<BR> 
		<input type="submit" > 
		
		
	</form>
	
	// home.jsp
	 * 
 */
