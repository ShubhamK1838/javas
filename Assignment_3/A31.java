package sources;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//1) Write a simple servlet that prints “Hello”

@WebServlet("/A31")
public class A31 extends HttpServlet {
	
	protected void doGet(HttpServletRequest s, HttpServletResponse r)  {
		try {
			
			r.getWriter().println("HELLO JAVA"); 
			
		}catch(Exception  e)
		{
			
		}
	
	}

	
}
