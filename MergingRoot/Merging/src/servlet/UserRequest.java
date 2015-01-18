package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserRequest.do")
public class UserRequest extends HttpServlet {
	public String getParsedJSONString() {
		return parsedJSONString;
	}

	public void setParsedJSONString(String parsedJSONString) {
		
		this.parsedJSONString = parsedJSONString;
		
	}
	
	public String parsedJSONString;

	private static final long serialVersionUID = 1L;
       
    public UserRequest() {
        super();        
    }

    
    JSONklass jklass = new JSONklass();
    
	public ArrayList<String> hoi = new ArrayList<String>();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		 		 
		String button_param = request.getParameter("Data1");
		
		parsedJSONString = br.readLine();
		
		setParsedJSONString(parsedJSONString);
	
		hoi.add(getParsedJSONString());
		
	//	System.out.println(getListAR());

		session.setAttribute("getArr", getListAR());
		
		request.getRequestDispatcher("OutputUser.do").forward(request, response);
		 
}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	
	public ArrayList<String> getListAR() {
		
		return hoi;
		
	}
	
	
}


//JSONklass jk = new JSONklass();
//jk.fillArrayList();


//out.print(jk.getList());

//try {
//	
//	
//System.out.println(jk.getList());
//} catch (JSONException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
// if(button_param.equals("Save"))
// {
//	 response.sendRedirect("OutputUser");
// }

//
//
//while ((!= null)
//		 {	
//			
//			 
//		 }		