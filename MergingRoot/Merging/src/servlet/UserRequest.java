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


	public static String parsedJSONString;
	
	public static String getParsedJSONString() {
		return parsedJSONString;
	}

	public void setParsedJSONString(String parsedJSONString) {
		
		UserRequest.parsedJSONString = parsedJSONString;
		
	}
	
	private static final long serialVersionUID = 1L;
       
    public UserRequest() {
        super();        
    }

    
    JSONklass jklass = new JSONklass();
    
	public static ArrayList<String> hoi = new ArrayList<String>();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		response.setContentType("application/json");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		 		 
		parsedJSONString = br.readLine();
		
		setParsedJSONString(parsedJSONString);
		
		hoi.add(getParsedJSONString());
	
		session.setAttribute("getArr", getListAR());
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	
	public ArrayList<String> getListAR() {
		
		return hoi;
		
	}
}