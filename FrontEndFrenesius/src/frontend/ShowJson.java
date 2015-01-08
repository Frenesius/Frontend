package frontend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import json.JSONklass;


@WebServlet("/ShowJson")
public class ShowJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowJson() {
    	
        super();
    }


	JSONklass jko = new JSONklass();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		ArrayList<JSONObject> listje = jko.getList();
		if (jko.getList().isEmpty()) {
			out.println("Arraylist is empty");
		} else {
			out.print(listje);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
	}

}
