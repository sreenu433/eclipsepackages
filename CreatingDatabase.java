package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDatabase
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		//create statement 
		Statement stmt= con.createStatement();
		//statement int00000000000000000000000000000000000000000000000000000000erface  .. createStatement() is method 
		// stmt is used to carry the query from java application to database 
		stmt.execute("create database school ");
		//for execute we use execute() method is used 
		System.out.println("database is created");
	
	}

}
