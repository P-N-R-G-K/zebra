package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
//	   public static void main(String[] args) {
//			System.out.println(Getconnection());
//		}
   public static Connection con=null;
   public static Connection Getconnection()
   {
	   
	   try{  
		   Class.forName("com.mysql.jdbc.Driver");  
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssdproject","root","ganesh");    
		   }
	       catch(Exception e)
	       {
	    	   System.out.println(e);
		   }  
	   return con;
   }
}
