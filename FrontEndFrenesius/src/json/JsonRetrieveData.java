package json;


import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonRetrieveData {
	

		static ArrayList<String> JSONStringsArrayList = new ArrayList<String>();

		public static void main(String[] args) throws JSONException {
			//JSONParser parser = new JSONParser();
			//String url = "C:/Users/Abid/Desktop/Graphicscard.json";
			//try {
				//	JSONParser parser = new JSONParser();
					//Object obj = parser.parse(new FileReader("C:/Users/Abid/Desktop/Graphicscard.json"));
					
					//JSONObject jsonObject = (JSONObject) obj;
					
					//String naa = (String) jsonObject.get("cpu");
			JSONObject jsonObjectCPU = new JSONObject("{'cpu':{'SKU': 'GTX 970 GAMING 4G, V316-001R', 'Hoogte': '35mm', 'Hoogste HDMI-versie': 'HDMI 2.0', 'Hoogste DisplayPort versie': 'DisplayPort 1.2'}}");
			JSONObject jsonObjectGPU = new JSONObject("{'gpu':{'BLA': '90YV0541-M0NA00, RoG Mars 760', 'Uitvoering': 'Asus Republic Of Gamers Mars 760', 'Geheugengrootte': '4GB', 'Videochipfabrikant': 'Nvidia', 'Geheugen Busbreedte': '256 bit', 'Geheugen Snelheid': '6,008GHz', 'Chipset generatie': 'GeForce 700 Serie', 'Serie': 'Republic Of Gamers', 'OpenGL versie': '4.3', 'Type koeling': 'Actieve fan', 'Tweakers ID': '357612', 'Aantal slots': '2x', 'Card Interface (Video)': 'PCI-e 3.0 x16', 'Laagste prijs': ' ', 'Geheugen Type (videokaarten)': 'GDDR5', 'Aantal aanbieders': '22 winkels', 'Aantal pins (videokaarten)': '2x 8 pins', 'Link Interface': 'Nvidia SLi', 'Nominale snelheid videochip': '1,006GHz'}}");
			JSONObject jsonObjectRAM = new JSONObject("{'ram':{'jaja': '90YV0541-M0NA00, RoG Mars 760', 'Uitvoering': 'Asus Republic Of Gamers Mars 760', 'Geheugengrootte': '4GB', 'Videochipfabrikant': 'Nvidia', 'Geheugen Busbreedte': '256 bit', 'Geheugen Snelheid': '6,008GHz', 'Chipset generatie': 'GeForce 700 Serie', 'Serie': 'Republic Of Gamers', 'OpenGL versie': '4.3', 'Type koeling': 'Actieve fan', 'Tweakers ID': '357612', 'Aantal slots': '2x', 'Card Interface (Video)': 'PCI-e 3.0 x16', 'Laagste prijs': ' ', 'Geheugen Type (videokaarten)': 'GDDR5', 'Aantal aanbieders': '22 winkels', 'Aantal pins (videokaarten)': '2x 8 pins', 'Link Interface': 'Nvidia SLi', 'Nominale snelheid videochip': '1,006GHz'}}");
			JSONObject jsonObjectHDD = new JSONObject("{'hdd':{}}");
			JSONObject jsonObjectSSD = new JSONObject("{'ssd':{}}");
			JSONObject jsonObjectPSU = new JSONObject("{'psu':{}}");
			JSONObject jsonObjectCASE = new JSONObject("{'case':{}}");
			JSONObject jsonObjectMotherBoard = new JSONObject("{'motherboard':{}}");
			JSONObject jsonObjectOpticalDrive = new JSONObject("{'opticaldrive':{}}");
			JSONObject jsonObjectSoundCard = new JSONObject("{'soundcard':{}}");
			

			String cpuJsonString = jsonObjectCPU.toString();
			String gpuJsonString = jsonObjectGPU.toString();
			String ramJsonString = jsonObjectRAM.toString();
			String hddJsonString = jsonObjectHDD.toString();
			String ssdJsonString = jsonObjectSSD.toString();
			String psuJsonString = jsonObjectPSU.toString();
			String caseJsonString = jsonObjectCASE.toString();
			String motherboardJsonString = jsonObjectMotherBoard.toString();
			String opticaldriveJsonString = jsonObjectOpticalDrive.toString();
			String soundcardJsonString = jsonObjectSoundCard.toString();

			JSONStringsArrayList.add(cpuJsonString);
			JSONStringsArrayList.add(gpuJsonString);
			JSONStringsArrayList.add(ramJsonString);
			JSONStringsArrayList.add(hddJsonString);
			JSONStringsArrayList.add(ssdJsonString);
			JSONStringsArrayList.add(psuJsonString);
			JSONStringsArrayList.add(caseJsonString);
			JSONStringsArrayList.add(motherboardJsonString);
			JSONStringsArrayList.add(opticaldriveJsonString);
			JSONStringsArrayList.add(soundcardJsonString);
			
			System.out.println(JSONStringsArrayList);
			
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


