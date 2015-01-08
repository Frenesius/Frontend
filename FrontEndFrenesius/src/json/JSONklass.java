package json;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONklass {
	
	public ArrayList<JSONObject> JSONStringsArrayList = new ArrayList<JSONObject>();
	
	public void Start() throws JSONException {
		jsonMeth();
	}
	
	public void jsonMeth() throws JSONException {
		
		
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
	
	if(jsonObjectCPU.isNull("") || jsonObjectCPU.get("").equals("")) {
		
		jsonObjectCPU.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectGPU.isNull("") || jsonObjectGPU.get("").equals("")) {
		
		jsonObjectGPU.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectRAM.isNull("") || jsonObjectRAM.get("").equals("")) {
		
		jsonObjectRAM.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectHDD.isNull("") || jsonObjectHDD.get("").equals("")) {
		
		jsonObjectHDD.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectSSD.isNull("") || jsonObjectSSD.get("").equals("")) {
		
		jsonObjectSSD.put("", JSONObject.NULL);
		
	}

	if(jsonObjectPSU.isNull("") || jsonObjectPSU.get("").equals("")) {
		
		jsonObjectPSU.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectCASE.isNull("") || jsonObjectCASE.get("").equals("")) {
		
		jsonObjectCASE.put("", JSONObject.NULL);
		
	} 
	
	if(jsonObjectMotherBoard.isNull("") || jsonObjectMotherBoard.get("").equals("")) {
		
		jsonObjectMotherBoard.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectOpticalDrive.isNull("") || jsonObjectOpticalDrive.get("").equals("")) {
		
		jsonObjectOpticalDrive.put("", JSONObject.NULL);
		
	}
	
	if(jsonObjectSoundCard.isNull("") || jsonObjectSoundCard.get("").equals("")) {
		
		jsonObjectSoundCard.put("", JSONObject.NULL);
		
	}
	
	JSONObject jsonCPU = jsonObjectCPU.getJSONObject("cpu");
	JSONObject jsonGPU = jsonObjectGPU.getJSONObject("gpu");
	JSONObject jsonRAM = jsonObjectRAM.getJSONObject("ram");
	JSONObject jsonHDD = jsonObjectHDD.getJSONObject("hdd");
	JSONObject jsonSSD = jsonObjectSSD.getJSONObject("ssd");
	JSONObject jsonPSU = jsonObjectPSU.getJSONObject("psu");
	JSONObject jsonCASE = jsonObjectCASE.getJSONObject("case");
	JSONObject jsonMotherBoard = jsonObjectMotherBoard.getJSONObject("motherboard");
	JSONObject jsonOpticalDrive = jsonObjectOpticalDrive.getJSONObject("opticaldrive");
	JSONObject jsonSoundCard = jsonObjectSoundCard.getJSONObject("soundcard");
	
	
	JSONStringsArrayList.add(jsonCPU);
	JSONStringsArrayList.add(jsonGPU);
	JSONStringsArrayList.add(jsonRAM);
	JSONStringsArrayList.add(jsonHDD);
	JSONStringsArrayList.add(jsonSSD);
	JSONStringsArrayList.add(jsonPSU);
	JSONStringsArrayList.add(jsonCASE);
	JSONStringsArrayList.add(jsonMotherBoard);
	JSONStringsArrayList.add(jsonOpticalDrive);
	JSONStringsArrayList.add(jsonSoundCard);


	System.out.println(JSONStringsArrayList);
	}

	
	public ArrayList<JSONObject> getList() {
		
		return JSONStringsArrayList;
		
	}
}
