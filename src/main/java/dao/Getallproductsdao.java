package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBconnection;
import dto.Productdto;

public class Getallproductsdao 
{

     public static List<Productdto> Getallproductsdao()
     {
    	 List<Productdto> productList=new ArrayList<Productdto>();
    	 String query="select * from products";
    	 try
    	 {
    		 Connection con=DBconnection.Getconnection();
    		 PreparedStatement ps=con.prepareStatement(query);
    		 ResultSet rs=ps.executeQuery();
    		 while(rs.next())
    		 {
    			 productList.add(new Productdto(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5))) ;
    		 }
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
    	 return productList;
     }
}
