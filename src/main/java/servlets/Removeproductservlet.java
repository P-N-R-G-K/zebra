package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cartdto;

/**
 * Servlet implementation class Removeproductservlet
 */
public class Removeproductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Removeproductservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("remove servlet open");
		Integer id=Integer.parseInt(request.getParameter("id"));
		List<Cartdto> oldcartlist=(List<Cartdto>) request.getSession().getAttribute("oldcartlist");
		int index=0;
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
		System.out.println("remove servlet close");
	}

}
