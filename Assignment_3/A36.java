package sources;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

//6) Write a program to create servlet to demonstrate session tracking with 
//HttpSession interface.


@WebServlet("/A16")
public class A36 extends HttpServlet {
	
	public void doGet(HttpServletRequest s, HttpServletResponse r) {
		
		
			
		HttpSession st=s.getSession(); 
		
		st.setAttribute("user", s.getParameter("user"));
		
		
	}
	public void doPost(HttpServletRequest r, HttpServletResponse  s) throws IOException
	{
		HttpSession st=r.getSession(); 
		
		s.getWriter().println("<h1> Wellcome User :  "+st.getAttribute("user")); 
	}
	
	
}
