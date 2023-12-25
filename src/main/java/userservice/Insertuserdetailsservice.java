package userservice;

import dao.Insertuserdetailsdao;
import dto.Signupdto;

public class Insertuserdetailsservice 
{
	  public static int Insertuser(Signupdto dto)
	  {
		 return Insertuserdetailsdao.Insertuser(dto); 
	  }
}
