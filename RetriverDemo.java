package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RetriverDemo{

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the id to get details");
			int id = scanner.nextInt();
			try
			{
				//step-1
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("class found");
			
				//Step-2
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/traininfo1?autoReconnect=true&useSSL=false","root","india@123");
				System.out.println("connected");
				
				//step-3
				Statement stmt= con.createStatement();
			    ResultSet rs=stmt.executeQuery("select * from employee");
			    while(rs.next())
			    {
			    	//system.out.println(rs.getInt(1));
			    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			    }
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			

		}

}
