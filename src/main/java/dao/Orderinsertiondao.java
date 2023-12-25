package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

import db.DBconnection;
import dto.Ordersdto;

public class Orderinsertiondao 
{

	public static int Insertorderdetails(Integer id,Integer quantity,Integer uid)
	{
		Ordersdto dto=new Ordersdto();
		String getproductbyid="select * from products where pid=?";
		String insertproductQuery="insert into orders (odate, oname, ocategory, oquantity, opricel, uid) values(?,?,?,?,?,?)";
		int result=0;
		try
		{
			Connection con=DBconnection.Getconnection();
			PreparedStatement ps= con.prepareStatement(getproductbyid);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				dto.setOdate(LocalDateTime.now().toString());
				dto.setOname(rs.getString(2));
				dto.setOcategory(rs.getString(4));
				dto.setOpricel(rs.getDouble(3));
				dto.setUid(uid);
			}
			PreparedStatement ps2= con.prepareStatement(insertproductQuery);
			ps2.setString(1,dto.getOdate());
			ps2.setString(2, dto.getOname());
			ps2.setString(3, dto.getOcategory());
			ps2.setInt(4,quantity);
			ps2.setDouble(5,dto.getOpricel());
			ps2.setInt(6,uid);
			result=ps2.executeUpdate();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return result;
	}
	
}
