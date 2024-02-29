package sources;


import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class A38
 */
@WebServlet("/A38")
public class A38 extends HttpServlet {
	
	protected void doGet(HttpServletRequest s, HttpServletResponse r) throws ServletException, IOException {
		
		PrintWriter write=r.getWriter(); 
		
		r.setContentType("text/html");
		
		
		
		write.println("<input type=\"hidden\" name=\"user_name\" value="+s.getParameter("user_name")+" > "); 
		
		
		write .close(); 
	}

	

}
