package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> af078eb6962d0c91da51977373e94723aef3aff7
public class StudentDao {
	public static Connection getCon() {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/stu";
		String user="root";
		String pas="root@39";
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pas);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
public void saveStudent(Student st) {
	try {
	String sql="insert into student(id,st_name,usn,city)values(?,?,?,?)";
	Connection con=StudentDao.getCon();
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setInt(1, st.getId());
	pst.setString(2,st.getName());
	pst.setString(3,st.getUsn());
	pst.setString(4,st.getCity());
	pst.execute();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public List<Student>getAllStudents(){
	List<Student> stdList=new ArrayList<>();
	try {
		String sql="select * from student";
		PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Student st=new Student();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setUsn(rs.getString(3));
			st.setCity(rs.getString(4));
			stdList.add(st);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return stdList;
	
	
}
public void updateStudent(Student st) {
	try {
		String sql="update student set st_name=?, usn=?, city=? where id=?";
		PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
		pst.setString(1,st.getName());
		pst.setString(2, st.getUsn());
		pst.setString(3,st.getCity());
		pst.setInt(4, st.getId());
		pst.execute();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void deleteStudent(int id) {
	try {
		String sql="delete from student where id=?";
		PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
		pst.setInt(1, id);
		pst.execute();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
