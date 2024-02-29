package sources;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 9) Write a program to create servlet for session management using URL
 * Rewriting
 */
@WebServlet("/A39")
public class A39 extends HttpServlet {

	protected void doPost(HttpServletRequest s, HttpServletResponse r) throws ServletException, IOException {

		r.sendRedirect("A39.jsp?user_name=" + s.getParameter("user_name"));

	}

}
/*
 * index.html <form method="post" action="A39">
 * 
 * <input type="text" name="user_name"> <BR>
 * 
 * <input type="submit" >
 * 
 * 
 * </form>
 * 
 * ///////////////
 * 
 * 
 * A39.jsp 
 * <body>
 * 
 * <p>Welcome: <%= request.getParameter("user_name") %></p>
 * 
 * </body>
 * 
 * 
 * 
 * 
 */
