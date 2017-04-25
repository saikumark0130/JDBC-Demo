package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class SqlConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","123456");
		System.out.println("Connection creating.....................");
		
		Statement stmt=(Statement) conn.createStatement();
		String sql="Create table Proffesor(id int, fName Varchar(255), LName Varchar(255))";
		
		stmt.executeUpdate(sql);
		System.out.println("Table created............");
		
		conn.close();
		
		
		
	/*	Scanner sc= new Scanner(System.in);
		int id=sc.nextInt();
		String fname=sc.next();
		String lname=sc.next();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","123456");
		System.out.println("Connection creating.....................");
		
		
		String sql="Insert into student (id, fName,LName) values(?,?,?)";
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.setString(2,fname);
		stmt.setString(3, lname);
		
		
		stmt.executeUpdate();
		System.out.println("Values inserted.............");
		
		conn.close();*/
		
	}

}
