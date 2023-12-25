package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Validation;
import dto.Signupdto;
import userservice.Insertuserdetailsservice;

/**
 * Servlet implementation class Signupservlet
 */
public class Signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signupservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		System.out.println("Signupservlet open");
		String ErrMsg="Please Enter Valid Credentails for";
		String error="true";
		String fname = null;
		if(Validation.isValidUsername(request.getParameter("cfname")))
		{
			fname=request.getParameter("cfname");
			error="false";
			System.out.println("FirstName is verified");
		}
		else
		{
			error="true";
			ErrMsg=ErrMsg+" FirstName";
			request.setAttribute("ErrMsg", ErrMsg);
			request.setAttribute("error", error);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		String lname=null;
		if(Validation.isValidUsername(request.getParameter("clname")) && error=="false")
		{
			error="false";
			lname=request.getParameter("clname");
			System.out.println("LastName is verified");
		}
		else
		{
			error="true";
			ErrMsg=ErrMsg+" LastName";
			request.setAttribute("ErrMsg", ErrMsg);
			request.setAttribute("error", error);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		String email=null;
		if(Validation.isValid(request.getParameter("cemail")) && error=="false")
		{
			error="false";
			email=request.getParameter("cemail");
			System.out.println("email is verified");
		}
		else
		{
			error="true";
			ErrMsg=ErrMsg+" Email";
			request.setAttribute("ErrMsg", ErrMsg);
			request.setAttribute("error", error);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		String password=null;
		if(Validation.isValidPassword(request.getParameter("cpassword")) && error=="false")
		{
			error="false";
			password=request.getParameter("cpassword");
			System.out.println("password is verified");
		}
		else
		{
			error="true";
			ErrMsg=ErrMsg+" Password";
			request.setAttribute("ErrMsg", ErrMsg);
			request.setAttribute("error", error);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		if(error=="false")			
		System.out.println(fname+"  "+lname+"  "+email+"  "+password);
		Signupdto dto=new Signupdto(fname,lname,email,password);
		int result=Insertuserdetailsservice.Insertuser(dto);
		if(result!=0)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			System.out.println("plese check dao class code");
		}
		
		System.out.println("Signupservlet close");




	}

}
