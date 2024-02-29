package sources;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 * Servlet implementation class A12
 */
@WebServlet("/A12")
public class A32 extends HttpServlet {
	
	public void doPost(HttpServletRequest s, HttpServletResponse r)
	{
		try {
			
			r.getWriter().println("Hello "+s.getParameter("user")); 
		}catch(Exception e) {}; 
		
	}

}
