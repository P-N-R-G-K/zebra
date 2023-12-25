package userservice;

import dao.Orderinsertiondao;

public class Orderinsertionservice
{  
	public static int Orderinsertion(Integer id,Integer quantity,Integer uid)
	{
		return Orderinsertiondao.Insertorderdetails(id, quantity, uid);
	}

}
