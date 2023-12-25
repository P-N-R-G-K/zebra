package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Productdto;
import userservice.Productinsertionservice;

/**
 * Servlet implementation class ProductInsertion
 */
public class ProductInsertion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("productinsertion servlet open");
		String pname=request.getParameter("pname");
		double pprice=Double.parseDouble(request.getParameter("pprice"));
		String pcategory=request.getParameter("pcategory");
		String pimg=request.getParameter("pimg");
		Productdto dto=new Productdto(pname,pprice,pcategory,pimg);
		int result=Productinsertionservice.Productinsertion(dto);
		if(result!=0)
		{
			response.sendRedirect("productview");
		}
		else
		{
			System.out.println("please check code");
		}
		
		
		System.out.println("productinsertion servlet close");
	}

}
