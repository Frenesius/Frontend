package frontend;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.JsonRetrieveData;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




@WebServlet("/JsonDataRetrieve")
public class Jsonnn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Jsonnn() {
        super();
    }
    
//    ArrayList<String> jsonStrings = new ArrayList<String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
//		String url = "C:/Users/Abid/Desktop/Graphicscard.json";
//		
//		JSONParser parser = new JSONParser();
		
//			try {
//				Object obje = parser.parse(new FileReader(url));
//				JSONObject jsonObject = (JSONObject) obje;
//				
//				String CPU = jsonObject.getString("SKU");
//				String GPU = jsonObject.getString("");
//				String RAM = jsonObject.getString("");
//				String HDD = jsonObject.getString("");
//				String SSD = jsonObject.getString("");
//				String PSU = jsonObject.getString("");
//				String CASE = jsonObject.getString("");
//				String motherBoard = jsonObject.getString("");
//				String OpticalDrive = jsonObject.getString("");
//				String soundCard = jsonObject.getString("");
//				
//				
//				jsonStrings.add(CPU);
//				jsonStrings.add(GPU);
//				jsonStrings.add(RAM);
//				jsonStrings.add(HDD);
//				jsonStrings.add(SSD);
//				jsonStrings.add(PSU);
//				jsonStrings.add(CASE);
//				jsonStrings.add(motherBoard);
//				jsonStrings.add(OpticalDrive);
//				jsonStrings.add(soundCard);
//				
//				
//				out.println(jsonStrings);
//				
//			} catch (ParseException | JSONException e2) {
//				// TODO Auto-generated catch block
//				e2.printStackTrace();
//			}
			
			
		
//		try {
//			JSONArray c = jsonObject.getJSONArray("");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//for(int i = 0; i < c.length(); i++) {
			
//			try {
//					
//				} catch (JSONException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
}
