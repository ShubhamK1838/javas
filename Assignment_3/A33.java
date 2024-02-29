package sources;

import java.io.*; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


//3) Write a program to create servlet with doGet()

@WebServlet("/A33")
public class A33 extends HttpServlet {
	public void doGet(HttpServletRequest s, HttpServletResponse r) throws IOException 
	{
	
			
			r.getWriter().print("<H1> HELLO User </H1> "); 
	}
	
		
	

}
