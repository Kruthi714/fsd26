package com.test;
import java.sql.ResultSet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

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
//		obj.setUserName(usr);
//		obj.setPassword(pas);
//		if(usr.equals("admin") && pas.equals("java")) {
//			out.println("Login success..");
//		}
		String sql="select username, password from user101 where username=' "+usr+"' and password='"+pas+"' ";
		try {
			Connection con=DBDemo.getDbcon();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				obj.setUserName(rs.getString(1));
				obj.setPassword(rs.getString(2));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		if(usr.equals(obj.getUserName()) && pas.equals(obj.getPassword())) {
			RequestDispatcher rd=request.getRequestDispatcher("home.html");//we can give the link also
			rd.forward(request, response);
		}
		else {
			out.println("<center><font color='red'>Invalid credentials.</font></center>");
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.include(request, response);
			
		}
	}

}
