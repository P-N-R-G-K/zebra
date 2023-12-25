package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Signupdto;
import userservice.Loginservice;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      System.out.println("Loginservlet is open");
	      String email=request.getParameter("cemail");
	      String password=request.getParameter("cpassword");
	      Signupdto user=Loginservice.Login(email, password);
	      System.out.println(user.getId()+" "+user.getFname());
	      request.getSession().setAttribute("user", user);
	      request.getSession().setAttribute("name", user.getFname());
	      request.getSession().setAttribute("userid", user.getId());
	      response.sendRedirect("productview");
	      System.out.println("Loginservlet is close");

	      
	    
	}

}
