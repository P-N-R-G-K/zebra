package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cartdto;

/**
 * Servlet implementation class Cartincdecservlet
 */
public class Cartincdecservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cartincdecservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("cartincdecservlet open");
		String action=request.getParameter("action");
		Integer id=Integer.parseInt(request.getParameter("id"));
		Integer quantity=Integer.parseInt(request.getParameter("quantity"));
		System.out.println(action+" "+id+" "+quantity);
		List<Cartdto> oldcartlist=(List<Cartdto>) request.getSession().getAttribute("oldcartlist");
		for(Cartdto dto:oldcartlist)
		{
			if(dto.getPid()==id)
			{
				 if(action.equals("increment"))
				 {
					 dto.setQuantity(dto.getQuantity()+1);
				 }
				 else
				 {
					 dto.setQuantity(dto.getQuantity()-1);

				 }
			}
		}
		request.getSession().setAttribute("oldcartlist", oldcartlist);
		request.getRequestDispatcher("cartproductsview").forward(request, response);
		System.out.println("cartincdecservlet close");

	}

}
