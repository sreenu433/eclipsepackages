package assement2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertingValues 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "root");
		//create statement 
	//Statement stmt= con.createStatement();//does not have any parameters
	
		//System.out.println("values inserted successfully...");
		//? is an placeholder
		PreparedStatement p=con.prepareStatement("insert into new_table values(?,?,?,?,?)");
		 Scanner sc = new Scanner(System.in);
		 // take input from the user
		 System.out.println("enter the id");
		 int id=sc.nextInt();
		 System.out.println("enter the name ");
		 String name=sc.next();
		 System.out.println("enter the age");
		 int age=sc.nextInt();
		 System.out.println("enter the mockrating");
		 String mock=sc.next();
		 System.out.println("enter the fee");
		 int fee=sc.nextInt();
		 //set the values to the query
		 p.setInt(1, id);
		 p.setString(2, name);
		 p.setInt(3, age);
		 p.setString(4, mock);
		 p.setInt(5, fee);
		 //execute query
		 p.executeUpdate();
		 
	}

}
