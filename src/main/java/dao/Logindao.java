package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBconnection;
import dto.Signupdto;

public class Logindao 
{

	   public static Signupdto Login(String Email,String Password)
	   {
		   Signupdto dto=new Signupdto();
		   
		String query="select * from customers where cemail=? and cPassword=?";   
		   try
		   {
			   Connection con=DBconnection.Getconnection();
			   PreparedStatement ps=con.prepareStatement(query);
			   ps.setString(1, Email);
			   ps.setString(2, Password);
			   ResultSet rs=ps.executeQuery();
			   while(rs.next())
			   {
				   dto.setId(rs.getInt(1));
				   dto.setFname(rs.getString(2));
				   dto.setLname(rs.getString(3));
				   dto.setEmail(rs.getString(4));
				   dto.setPassword(rs.getString(5));
			   }
			   
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   
		   
		   
		   return dto;
	   }
}
