package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cartdto;

/**
 * Servlet implementation class AddcartServlet
 */
public class AddcartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddcartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("addtocart open");
     	Integer id= Integer.parseInt(request.getParameter("id"));
     	List<Cartdto> oldcartlist=(List<Cartdto>) request.getSession().getAttribute("oldcartlist");
     	List<Cartdto> newcartlist=new ArrayList<Cartdto>();
     	Cartdto dto=new Cartdto();

     	if(oldcartlist!=null && oldcartlist.size()>=1)
     	{
     		newcartlist=oldcartlist;
     		for(Cartdto temp:newcartlist)
     		{
     			if(temp.getPid()==id)
     			{
     				System.out.println("your selection alredy in cart");
     				return;
     			}
     		}
     		dto.setPid(id);
         	dto.setQuantity(1);
         	newcartlist.add(dto);
         	request.getSession().setAttribute("oldcartlist", newcartlist);
         	request.getRequestDispatcher("productview").forward(request, response);
     	}
     	else
     	{
     	dto.setPid(id);
     	dto.setQuantity(1);
     	newcartlist.add(dto);
     	request.getSession().setAttribute("oldcartlist", newcartlist);
     	request.getRequestDispatcher("productview").forward(request, response);
		System.out.println("addtocart close");
     	}
    }

}
