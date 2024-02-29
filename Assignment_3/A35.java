package sources;


import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//) Write a program to create Cookie and use a cookie .

@WebServlet("/A15")
public class A35 extends HttpServlet {

	public void doPost(HttpServletRequest s, HttpServletResponse r) {
		try {

			Cookie data = new Cookie("username", s.getParameter("user"));
			
			r.addCookie(data);
			 PrintWriter out=r.getWriter(); 
			for(Cookie ele : s.getCookies())
			{
				out.println("<BR> Name: "+ele.getName());
				out.println(" Data :"+ele.getValue());
			}
			
		} catch (Exception e) {
		}

	}

}
