package assement2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateValues 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "root");
	PreparedStatement p=con.prepareStatement("update new_table set  name=? where id=?");
	 Scanner sc = new Scanner(System.in);
	 // take input from the user
	 System.out.println("enter the name ");
		String name=sc.next();
	 System.out.println("enter the id");
	 int id=sc.nextInt();
	 	
	 p.setInt(1, id);
 	p.setString(2, name);
	 p.executeUpdate();
	 
	 
}
}
