package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;
import dto.Signupdto;

public class Insertuserdetailsdao 
{
	public static void main(String[] args) {
		Insertuser(new Signupdto("dbd","hsb","bcc","sjhcbs"));
	}
	  public static int Insertuser(Signupdto dto)
	  {
		  int result=0;
		  String query="insert into customers(cfname, clname, cemail, cpassword) values(?,?,?,?) ";
		  try
		  {
			 Connection con=DBconnection.Getconnection();
			 PreparedStatement ps= con.prepareStatement(query);
			 ps.setString(1,dto.getFname());
			 ps.setString(2, dto.getLname());
			 ps.setString(3, dto.getEmail());
			 ps.setString(4,dto.getPassword());
			 result =ps.executeUpdate();
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  return result;
	  }

}
