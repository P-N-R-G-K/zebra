package userservice;

import dao.Productinsertiondao;
import dto.Productdto;

public class Productinsertionservice 
{
  public static int Productinsertion(Productdto dto)
  {
	  return Productinsertiondao.Produinsertion(dto);
  }
}
