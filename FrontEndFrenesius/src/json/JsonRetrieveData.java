package json;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRetrieveData {


	  //  static ArrayList<String> jsonStrings = new ArrayList<String>();

	    
	    
		public static void main(String[] args) throws JSONException {
			//JSONParser parser = new JSONParser();
			//String url = "C:/Users/Abid/Desktop/Graphicscard.json";
			//try {
				//	JSONParser parser = new JSONParser();
					//Object obj = parser.parse(new FileReader("C:/Users/Abid/Desktop/Graphicscard.json"));
					
					//JSONObject jsonObject = (JSONObject) obj;
					
					//String naa = (String) jsonObject.get("cpu");
			JSONObject obje = new JSONObject("{'cpu':{'SKU': 'GTX 970 GAMING 4G, V316-001R', 'Hoogte': '35mm', 'Hoogste HDMI-versie': 'HDMI 2.0', 'Hoogste DisplayPort versie': 'DisplayPort 1.2'}}");

			
			//String ab = obje.getString("cpu");
			JSONObject aa = obje.getJSONObject("cpu");
			
			ArrayList<JSONObject> JSONObjectsArrayList = new ArrayList<JSONObject>();
			
		//jsonObjectsJ.add(aa);

			//System.out.println(jsonObjectsJ);
			
			// ---------------------------------------
			
			JSONObject CPU = obje.getJSONObject("SKU");
			JSONObject GPU = obje.getJSONObject("");
			JSONObject RAM = obje.getJSONObject("");
			JSONObject HDD = obje.getJSONObject("");
			JSONObject SSD = obje.getJSONObject("");
			JSONObject PSU = obje.getJSONObject("");
			JSONObject CASE = obje.getJSONObject("");
			JSONObject motherBoard = obje.getJSONObject("");
			JSONObject OpticalDrive = obje.getJSONObject("");
			JSONObject soundCard = obje.getJSONObject("");
			
			JSONObjectsArrayList.add(CPU);
			JSONObjectsArrayList.add(GPU);
			JSONObjectsArrayList.add(RAM);
			JSONObjectsArrayList.add(HDD);
			JSONObjectsArrayList.add(SSD);
			JSONObjectsArrayList.add(PSU);
			JSONObjectsArrayList.add(CASE);
			JSONObjectsArrayList.add(motherBoard);
			JSONObjectsArrayList.add(OpticalDrive);
			JSONObjectsArrayList.add(soundCard);
			
//					} catch (FileNotFoundException e) {
//						e.printStackTrace();
//					} catch (IOException e) {
//						e.printStackTrace();
//					} catch (ParseException e) {
//						e.printStackTrace();
//					}
			
//			@SuppressWarnings("unused")
//			JSONParser parser = new JSONParser();
//			
//				try {
//					
//					JSONObject json = (JSONObject)new JSONParser().parse(url);
//					
//					System.out.println("part: " + json.get("GTX 970 GAMING 4G, V316-001R"));
					
//					String CPU = jsonObject.getString("SKU");
//					String GPU = jsonObject.getString("");
//					String RAM = jsonObject.getString("");
//					String HDD = jsonObject.getString("");
//					String SSD = jsonObject.getString("");
//					String PSU = jsonObject.getString("");
//					String CASE = jsonObject.getString("");
//					String motherBoard = jsonObject.getString("");
//					String OpticalDrive = jsonObject.getString("");
//					String soundCard = jsonObject.getString("");
					
					
//					jsonStrings.add(CPU);
//					jsonStrings.add(GPU);
//					jsonStrings.add(RAM);
//					jsonStrings.add(HDD);
//					jsonStrings.add(SSD);
//					jsonStrings.add(PSU);
//					jsonStrings.add(CASE);
//					jsonStrings.add(motherBoard);
//					jsonStrings.add(OpticalDrive);
//					jsonStrings.add(soundCard);
					
					
//					
//					
//				} catch (ParseException | JSONException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
//				
				//System.out.print(jsonStrings);
		
				
				
			
//			try {
//				JSONArray c = jsonObject.getJSONArray("");
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			//for(int i = 0; i < c.length(); i++) {
				
//				try {
//						
//					} catch (JSONException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
					
				}
		}
//}


