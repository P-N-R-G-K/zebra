package userservice;

import java.util.List;

import dao.Getproductdetailsbyoldcartlistiddao;
import dto.Cartdto;

public class Getproductdetailsbyoldcartlistidservice 
{
	  public static List<Cartdto> Getdetailsbyid(List<Cartdto> oldcartlist)
	  {
		  return   Getproductdetailsbyoldcartlistiddao.Getdetailsbyid(oldcartlist);
	  }

}
