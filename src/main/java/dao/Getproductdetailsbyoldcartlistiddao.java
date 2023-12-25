package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBconnection;
import dto.Cartdto;

public class Getproductdetailsbyoldcartlistiddao
{
  public static List<Cartdto> Getdetailsbyid(List<Cartdto> oldcartlist)
  {
	  System.out.println(oldcartlist);
	  String query="select * from products where pid=?";
	  List<Cartdto> allproductdetailsbyid=new ArrayList<Cartdto>();
	  try
	  {
		  Connection con=DBconnection.Getconnection();
		  PreparedStatement ps=con.prepareStatement(query);
		  for(Cartdto dto:oldcartlist)
		  {
			  ps.setInt(1,dto.getPid());
			  ResultSet rs=ps.executeQuery();
			  while(rs.next())
			  {
				  Cartdto temp=new Cartdto();
				  temp.setPid(dto.getPid());
				  temp.setPname(rs.getString(2));
				  temp.setPprice(rs.getDouble(3));
				  temp.setPcategory(rs.getString(4));
				  temp.setQuantity(dto.getQuantity());
				  allproductdetailsbyid.add(temp);
			  }
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  return allproductdetailsbyid;
  }

}
