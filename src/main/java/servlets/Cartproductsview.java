package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cartdto;
import userservice.Getproductdetailsbyoldcartlistidservice;

/**
 * Servlet implementation class Cartproductsview
 */
public class Cartproductsview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cartproductsview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("cartproductviewservlet open");
		List<Cartdto> oldcartlist=(List<Cartdto>) request.getSession().getAttribute("oldcartlist");
		List<Cartdto> getdetailsfromoldcartlistid=Getproductdetailsbyoldcartlistidservice.Getdetailsbyid(oldcartlist);
		int totalprice=0;
		for(Cartdto dto:getdetailsfromoldcartlistid)
		{
			totalprice+=dto.getPprice()*dto.getQuantity();
		}
		request.setAttribute("totalprice", totalprice);
		request.setAttribute("getdetailsfromoldcartlistid", getdetailsfromoldcartlistid);
		request.getRequestDispatcher("cartdataview.jsp").forward(request, response);
		System.out.println("cartproductviewservlet close");

	}

}
