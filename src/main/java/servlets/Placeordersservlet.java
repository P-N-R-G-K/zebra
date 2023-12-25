package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cartdto;
import dto.Ordersdto;
import userservice.Getorderservice;
import userservice.Orderinsertionservice;

/**
 * Servlet implementation class Placeordersservlet
 */
public class Placeordersservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Placeordersservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("placeorderbycartservlet open");
		String action=request.getParameter("action");
		List<Cartdto> oldcartlist=(List<Cartdto>) request.getSession().getAttribute("oldcartlist");
        int index=0;
		if(action.equals("landingpage"))
        {		Integer id=Integer.parseInt(request.getParameter("id"));

			Integer uid=(Integer) request.getSession().getAttribute("userid");
			Integer quantity=Integer.parseInt(request.getParameter("quantity"));
    		int result=Orderinsertionservice.Orderinsertion(id, quantity, uid);
    		if(result!=0)
    			System.out.println("=======");
    		else
    			System.out.println("--------------");

    		request.getSession().setAttribute("oldcartlist", oldcartlist);
    		request.getRequestDispatcher("productview").forward(request, response);
        }
        else if(action.equals("landingpage"))
        {		Integer id=Integer.parseInt(request.getParameter("id"));

    		Integer uid=(Integer) request.getSession().getAttribute("userid");
    		Integer quantity=Integer.parseInt(request.getParameter("quantity"));
    		int result=Orderinsertionservice.Orderinsertion(id, quantity, uid);
    		if(result!=0)
    			System.out.println("=======");
    		else
    			System.out.println("--------------");
    		for(Cartdto dto:oldcartlist)
    		{
    			if(dto.getPid()==id)
    			{
    				index=oldcartlist.indexOf(dto);
    			}
    		}
    		oldcartlist.remove(index);
    		request.getSession().setAttribute("oldcartlist", oldcartlist);
    		request.getRequestDispatcher("cartproductsview").forward(request, response);

        }

        else if(action.equals("orders"))
        {
   		Integer id=Integer.parseInt(request.getParameter("id"));
   		List<Ordersdto> orderdetailslist= Getorderservice.getorderdetails(id);
    	System.out.println("---------"+orderdetailslist);	

        request.setAttribute("orderdetailslist", orderdetailslist);
        request.getRequestDispatcher("ordersdataview.jsp").forward(request, response);
        }
		System.out.println("placeorderbycartservlet close");

	}

}
