package jdbcdemo;

import java.sql.*;
import java.sql.DriverManager;

public class jdbcdemo1 {

	public static void main(String[] args) {
		try
		{
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
			
			//step-2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/traininfo1?autoReconnect=true&useSSL=false","root","india@123");
					
			System.out.println("connected");
			//step-3
			Statement stmt = con.createStatement();
			stmt.execute("insert into employee valures(6,'ravi','hr',32)");
			System.out.println("connected");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
