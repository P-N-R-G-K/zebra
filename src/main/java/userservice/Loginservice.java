package userservice;

import java.util.List;

import dao.Logindao;
import dto.Signupdto;

public class Loginservice
{
   public static Signupdto Login(String Email,String Password)
   {
	   return Logindao.Login(Email, Password);
   }

}
