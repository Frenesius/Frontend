package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
		//RequestDispatcher disp2 = request.getRequestDispatcher("/UserRequest.do"); 
	
		PrintWriter out = response.getWriter();
		
		
		HttpSession session2 = request.getSession(true);
		
		System.out.println(session2.getAttribute("getArr"));
		
		session2.getAttribute("getArr");
		
		jsonClassPublic.hoi();
		
		
		//ArrayList<String> hoiaa = new ArrayList<String>();
		
		//String getPara = request.getParameter("Save");
		
		//hoiaa.add(request.getAttribute("getArr"));
		//hoiaa.add(getPara);
		//System.out.println(hoiaa);
		
//		try {
//			jsonClassPublic.Start();
//			
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");  
//	        out.println("<head>");  
//	        out.println("<title> A very simple servlet example</title>");  
//	        out.println("</head>");  
//	         out.println("<body>"); 
//	         out.println("Here are your parts: " + jsonClassPublic.getList());
//	           out.println("</body>"); 
//	           out.println("</html>");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
