package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String usr=request.getParameter("user");
		String pas=request.getParameter("pwd");
		User obj=new User();
		obj.setUserName(usr);
		obj.setPassword(pas);
//		if(usr.equals("admin") && pas.equals("java")) {
//			out.println("Login success..");
//		}
		if(usr.equals(obj.getUserName()) && pas.equals(obj.getPassword())) {
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.forward(request, response);
		}
		else {
			out.println("<center><font color='red'>Invalid credentials.</font></center>");
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.include(request, response);
			
		}
	}

}
