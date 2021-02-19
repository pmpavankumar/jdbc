package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Prepareddemo {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the id to get details");
			int id = scanner.nextInt();
			
			System.out.println("enter name details");
			String name = scanner.next();
			
			System.out.println("enter hr details");
			String dpt = scanner.next();
			
			System.out.println("enter age details");
			int age = scanner.nextInt();
			
			try
			{
				//step-1
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("class found");
			
				//Step-2
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/traininfo1?autoReconnect=true&useSSL=false","root","india@123");
				System.out.println("connected");
				
				PreparedStatement ps = con.prepareStatement("insert employee (?,?,?,?)");
				
			ps.setInt(1, id);
			//	ps.setString(2, name);
			//	ps.setString(3, dpt);
			//	ps.setInt(4, age);
				
			//	ps.execute();
				//System.out.println("inserted.......");
				
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));

			}
				System.out.println("insterted....");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			

		}
}
