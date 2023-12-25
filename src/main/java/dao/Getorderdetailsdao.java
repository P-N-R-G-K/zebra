package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBconnection;
import dto.Ordersdto;

public class Getorderdetailsdao 
{
    public static List<Ordersdto> getorderdetails(Integer id)
    {
    	List<Ordersdto> orderlist=new ArrayList<Ordersdto>();
    	String query="select * from orders where uid=?";
    	int result=0;
    	try
    	{
    	Connection con=DBconnection.Getconnection();
    	PreparedStatement ps=con.prepareStatement(query);
    	ps.setInt(1, id);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next())
    	{
    		orderlist.add(new Ordersdto(rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDouble(6)));
    	}
    	}catch(Exception e)
    	{
    	}
    	return orderlist;
    }
}
