package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class dash
 */
public class dash extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dash() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome to Dashboard page</h1>");
        HttpSession session=request.getSession(false);  
        String uname = null;
        if (session.getAttribute("uid") != null)
            uname =(String)session.getAttribute("uid");  
        if (uname == null ) {
            out.println("No UserId was found in session.<br>");
        } else {
            out.println("<h2>Login-Id obtained is : " + uname + "</h2><br>");
            out.println("<h3>Click here to <a href='logout'>Logout</a></h3><br>");
        }
        out.println("</body></html>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
