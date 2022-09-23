package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uid");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("ibtisam") && pass.equalsIgnoreCase("1234")) {
            HttpSession session=request.getSession();  
            session.setAttribute("uid",  uname);
			RequestDispatcher rd=request.getRequestDispatcher("dash");
			rd.forward(request, response);
		}
		else {
			out.println("<html><body>");
			
			out.println("<h3><font color='red'>Sorry... Invalid Credentials, Please Try Once Again.</font></h3>");
		
			out.println("</html></body>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
