package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.JSONklass;


/**
 * Servlet implementation class OutputUser
 */


@WebServlet("/OutputUser.do")
public class OutputUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputUser() {
    	
        super();
    }

   JSONklass jsonClassPublic = new JSONklass();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Object> obj = new ArrayList<Object>();
		ArrayList<String> hoiaa = new ArrayList<String>();
		HttpSession session2 = request.getSession(true);

		
		jsonClassPublic.yo();
		String hoi = "hoi mo";
		
		obj.add(session2.getAttribute("getArr"));
		hoiaa.add(hoi);
		
		request.setAttribute("itemList", hoiaa); 
		request.setAttribute("objlist", obj);
		ServletContext context= getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/OutputUser.jsp");
		rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
