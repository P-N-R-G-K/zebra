package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;
import dto.Productdto;

public class Productinsertiondao 
{

  public static int Produinsertion(Productdto dto)
  {
	  String query="insert into products(pname, pprice, pcategory, pimg ) values(?,?,?,?)";
	  int result=0;
	  try
	  {
		 Connection con=DBconnection.Getconnection();
		 PreparedStatement ps=con.prepareStatement(query);
		 ps.setString(1, dto.getPname());
		 ps.setDouble(2, dto.getPprice());
		 ps.setString(3, dto.getPcategory());
		 ps.setString(4, dto.getPimg());
		 result= ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  
	  
	  return result;
  }
}
