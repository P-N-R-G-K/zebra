package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Productdto;
import userservice.Getallproductservice;

/**
 * Servlet implementation class Productviewservlet
 */
public class Productviewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Productviewservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Productviewservlet open");
		List<Productdto> productlist=Getallproductservice.Getallproductsdao();
		System.out.println(productlist);
		request.setAttribute("productlist", productlist);
		request.getRequestDispatcher("landing.jsp").forward(request, response);
		System.out.println("Productviewservlet close");
	}

}
