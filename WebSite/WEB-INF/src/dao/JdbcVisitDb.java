package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.User;
public class JdbcVisitDb
{
	public List getUserRecord()
	throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/2024OODP", "root", "123456");
		String SqlStr = "SELECT * FROM USER";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SqlStr);
		List<User> al = new ArrayList<User>();
		User u;
		while(rs.next())
		{
			u = new User();
			u.setUsername(rs.getString("USER_NAME"));
			u.setPassword(rs.getString("PASSWORD"));
			al.add(u);
         	}
		rs.close();
		stmt.close();
		conn.close();
		return al;
	}
	
	public boolean checkLogin(String pUserName, String pPassword)
	throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/2024OODP", "root", "123456");
		String SqlStr = "SELECT * FROM USER WHERE USER_NAME = '" + pUserName + "' AND PASSWORD = '" + pPassword + "'";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SqlStr);
		System.out.println("SqlStr = " + SqlStr);
		boolean ret = rs.next();
		rs.close();
		stmt.close();
		conn.close();
		return ret;
	}
}