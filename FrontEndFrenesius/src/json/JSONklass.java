package json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.catalina.tribes.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONklass {
	
	public ArrayList<JSONObject> JSONStringsArrayList = new ArrayList<JSONObject>();
	
	public String jsonStr = "{'gpu':{'SKU':'912-V284-081, N760 TF 2GD5/OC, N760 TF-2GD5/OC, V284-081R','Hoogste HDMI-versie':'HDMI 1.4','Uitvoering':'2GB Gaming (N760 TF 2GD5/OC)','Beoordeling':' (57 reviews)','Geheugengrootte':'2GB','Aantal aanbieders':'34 winkels','Videochipfabrikant':'Nvidia','Geheugen Busbreedte':'256 bit','EAN':'0816909108637, 4719072301576','Chipset generatie':'GeForce 700 Serie','OpenGL versie':'4.3','Type koeling':'Actieve fan','Tweakers ID':'339487','Aantal slots':'2x','Lengte':'260mm','Hoogste DisplayPort versie':'DisplayPort 1.2','Laagste prijs':' ','Maximale resolutie':'4096x2160 (Cinema 4K)','Geheugen Type (videokaarten)':'GDDR5','Aantal pins (videokaarten)':'6 pins, 8 pins','Aantal 6 pins':'1x','Verkoopstatus':'Retail','Product':'MSI GeForce GTX 760','Link Interface':'Nvidia SLi','Nominale snelheid videochip':'1,085GHz','Aantal 8 pins':'1x','Video uit':'DisplayPort, DVI-D, DVI-I, HDMI','Card Interface (Video)':'PCI-e 3.0 x16','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'1,15GHz','url':'http://tweakers.net/pricewatch/339487/msi-geforce-gtx-760-2gb-gaming-(n760-tf-2gd5-oc)/','Geheugen Snelheid':'6,008GHz','Shader model':'5.0','Rekenkernen':'1.152','Merk':'MSI','Eerste prijsvermelding':'woensdag 26 juni 2013','Bijzonderheden':'DirectX feature level 11_0','DirectX versie':'11.1','Videochip':'GeForce GTX 760'},'cpu':{'SKU':'BX80646I74790K, BXF80646I74790K','Maximale snelheid videochip':'1,25GHz','CPU Instructieset':'AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, XD','Virtualisatie type':'Intel VT-d, Intel VT-x','Aantal aanbieders':'38 winkels','Snelheid':'4GHz','Beoordeling':' (16 reviews)','CPU Multiplier':'40','Gp':'Intel HD Graphics 4600','CPU Cache Level 3':'8MB','CPU Cache Level 2':'4x 256KB','Product':'Intel Core i7-4790K','Bus snelheid':'QuickPath 1x 5 GT/s','EAN':'0735858285957, 5032037065948, 5032037066181','Geheugen Specificatie':'PC3-12800 (DDR3-1600)','CPU sSpec Number':'SR219','Aantal cores':'Quad Core','Serie':'Core i7','Type koeling':'Actieve fan','Threads':'8x','Tweakers ID':'394885','Laagste prijs':' ','Socket':'1150','Geintegreerde graphics':'Ja','Verkoopstatus (CPU)':'Boxed','Nominale snelheid videochip':'350MHz','CPU Cache Level 1 ':'8x 32KB','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'4,4GHz','Procestechnologie':'22 nm','Thermal Design Power':'88W','url':'http://tweakers.net/pricewatch/394885/intel-core-i7-4790k-boxed/','CPU stepping':'C0','Virtualisatie':'Ja','Merk':'Intel','Eerste prijsvermelding':'woensdag 4 juni 2014','Bijzonderheden':'Unlocked multiplier'}}";
	
	public void hahaha() throws JSONException {
		
		Stringss hoa = new Stringss();
		
		hoa.setHierjson(jsonStr);
		
		String haha = hoa.getHierjson();
		
		JSONObject j = new JSONObject(haha);
				
		String ar = j.optString("cpu");
		
		System.out.println(ar);
	}
	//public void testje() {

	//	String jays = "'gpu':{'SKU':'912-V284-081, N760 TF 2GD5/OC, N760 TF-2GD5/OC, V284-081R','Hoogste HDMI-versie':'HDMI 1.4','Uitvoering':'2GB Gaming (N760 TF 2GD5/OC)','Beoordeling':' (57 reviews)','Geheugengrootte':'2GB','Aantal aanbieders':'34 winkels','Videochipfabrikant':'Nvidia','Geheugen Busbreedte':'256 bit','EAN':'0816909108637, 4719072301576','Chipset generatie':'GeForce 700 Serie','OpenGL versie':'4.3','Type koeling':'Actieve fan','Tweakers ID':'339487','Aantal slots':'2x','Lengte':'260mm','Hoogste DisplayPort versie':'DisplayPort 1.2','Laagste prijs':' ','Maximale resolutie':'4096x2160 (Cinema 4K)','Geheugen Type (videokaarten)':'GDDR5','Aantal pins (videokaarten)':'6 pins, 8 pins','Aantal 6 pins':'1x','Verkoopstatus':'Retail','Product':'MSI GeForce GTX 760','Link Interface':'Nvidia SLi','Nominale snelheid videochip':'1,085GHz','Aantal 8 pins':'1x','Video uit':'DisplayPort, DVI-D, DVI-I, HDMI','Card Interface (Video)':'PCI-e 3.0 x16','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'1,15GHz','url':'http://tweakers.net/pricewatch/339487/msi-geforce-gtx-760-2gb-gaming-(n760-tf-2gd5-oc)/','Geheugen Snelheid':'6,008GHz','Shader model':'5.0','Rekenkernen':'1.152','Merk':'MSI','Eerste prijsvermelding':'woensdag 26 juni 2013','Bijzonderheden':'DirectX feature level 11_0','DirectX versie':'11.1','Videochip':'GeForce GTX 760'},'cpu':{'SKU':'BX80646I74790K, BXF80646I74790K','Maximale snelheid videochip':'1,25GHz','CPU Instructieset':'AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, XD','Virtualisatie type':'Intel VT-d, Intel VT-x','Aantal aanbieders':'38 winkels','Snelheid':'4GHz','Beoordeling':' (16 reviews)','CPU Multiplier':'40','Gp':'Intel HD Graphics 4600','CPU Cache Level 3':'8MB','CPU Cache Level 2':'4x 256KB','Product':'Intel Core i7-4790K','Bus snelheid':'QuickPath 1x 5 GT/s','EAN':'0735858285957, 5032037065948, 5032037066181','Geheugen Specificatie':'PC3-12800 (DDR3-1600)','CPU sSpec Number':'SR219','Aantal cores':'Quad Core','Serie':'Core i7','Type koeling':'Actieve fan','Threads':'8x','Tweakers ID':'394885','Laagste prijs':' ','Socket':'1150','Geintegreerde graphics':'Ja','Verkoopstatus (CPU)':'Boxed','Nominale snelheid videochip':'350MHz','CPU Cache Level 1 ':'8x 32KB','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'4,4GHz','Procestechnologie':'22 nm','Thermal Design Power':'88W','url':'http://tweakers.net/pricewatch/394885/intel-core-i7-4790k-boxed/','CPU stepping':'C0','Virtualisatie':'Ja','Merk':'Intel','Eerste prijsvermelding':'woensdag 4 juni 2014','Bijzonderheden':'Unlocked multiplier'}";
		
	//	jays = jays.replaceAll("},", "}},");
		
	
	//	String[] tokens = jays.split("},");
	//	
		
		//	for (int i =0; i < tokens.length; i++) {
				
		//		System.out.println(tokens[i] + "\n"); 
				
		//	}
			
	//}/
	
	public void Start() throws JSONException {
		jsonMeth();
	}
	

	public void stringReceiverAngularJSON() {
		//JSONRequestServlet jsonServlet = new JSONRequestServlet();
		
		
	}
	
	public void jsonMeth() throws JSONException {		

	JSONObject jsonObjectCPU = new JSONObject("{}");
	JSONObject jsonObjectGPU = new JSONObject("");
	JSONObject jsonObjectRAM = new JSONObject("");
	JSONObject jsonObjectHDD = new JSONObject("");
	JSONObject jsonObjectSSD = new JSONObject("");
	JSONObject jsonObjectPSU = new JSONObject("");
	JSONObject jsonObjectCASE = new JSONObject("");
	JSONObject jsonObjectMotherBoard = new JSONObject("");
	JSONObject jsonObjectOpticalDrive = new JSONObject("");
	JSONObject jsonObjectSoundCard = new JSONObject("");
	
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

	
	
	System.out.println(JSONStringsArrayList + "\n");
	
	}

	
	public ArrayList<JSONObject> getList() {
		
		return JSONStringsArrayList;
		
	}
}
