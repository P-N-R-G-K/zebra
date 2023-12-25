package userservice;

import java.util.List;

import dao.Getorderdetailsdao;
import dto.Ordersdto;

public class Getorderservice 
{
    public static List<Ordersdto> getorderdetails(Integer id)
    {
    	return Getorderdetailsdao.getorderdetails(id);
    }
}  
