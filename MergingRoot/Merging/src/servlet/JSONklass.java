package servlet;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import servlet.UserRequest;

import org.json.JSONException;
import org.json.JSONObject;



	public class JSONklass {

		/**
		 * 
		 */
		
		
		private static final long serialVersionUID = 1L;
		public ArrayList opl = UserRequest.hoi;
		public ArrayList<String> JSONStringsArrayList = new ArrayList<String>();
		
		public void yo() {
			System.out.println(opl);
		}
		
		//public String jsonStr = "{'gpu':{'SKU':'912-V284-081, N760 TF 2GD5/OC, N760 TF-2GD5/OC, V284-081R','Hoogste HDMI-versie':'HDMI 1.4','Uitvoering':'2GB Gaming (N760 TF 2GD5/OC)','Beoordeling':' (57 reviews)','Geheugengrootte':'2GB','Aantal aanbieders':'34 winkels','Videochipfabrikant':'Nvidia','Geheugen Busbreedte':'256 bit','EAN':'0816909108637, 4719072301576','Chipset generatie':'GeForce 700 Serie','OpenGL versie':'4.3','Type koeling':'Actieve fan','Tweakers ID':'339487','Aantal slots':'2x','Lengte':'260mm','Hoogste DisplayPort versie':'DisplayPort 1.2','Laagste prijs':' ','Maximale resolutie':'4096x2160 (Cinema 4K)','Geheugen Type (videokaarten)':'GDDR5','Aantal pins (videokaarten)':'6 pins, 8 pins','Aantal 6 pins':'1x','Verkoopstatus':'Retail','Product':'MSI GeForce GTX 760','Link Interface':'Nvidia SLi','Nominale snelheid videochip':'1,085GHz','Aantal 8 pins':'1x','Video uit':'DisplayPort, DVI-D, DVI-I, HDMI','Card Interface (Video)':'PCI-e 3.0 x16','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'1,15GHz','url':'http://tweakers.net/pricewatch/339487/msi-geforce-gtx-760-2gb-gaming-(n760-tf-2gd5-oc)/','Geheugen Snelheid':'6,008GHz','Shader model':'5.0','Rekenkernen':'1.152','Merk':'MSI','Eerste prijsvermelding':'woensdag 26 juni 2013','Bijzonderheden':'DirectX feature level 11_0','DirectX versie':'11.1','Videochip':'GeForce GTX 760'},'cpu':{'SKU':'BX80646I74790K, BXF80646I74790K','Maximale snelheid videochip':'1,25GHz','CPU Instructieset':'AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, XD','Virtualisatie type':'Intel VT-d, Intel VT-x','Aantal aanbieders':'38 winkels','Snelheid':'4GHz','Beoordeling':' (16 reviews)','CPU Multiplier':'40','Gp':'Intel HD Graphics 4600','CPU Cache Level 3':'8MB','CPU Cache Level 2':'4x 256KB','Product':'Intel Core i7-4790K','Bus snelheid':'QuickPath 1x 5 GT/s','EAN':'0735858285957, 5032037065948, 5032037066181','Geheugen Specificatie':'PC3-12800 (DDR3-1600)','CPU sSpec Number':'SR219','Aantal cores':'Quad Core','Serie':'Core i7','Type koeling':'Actieve fan','Threads':'8x','Tweakers ID':'394885','Laagste prijs':' ','Socket':'1150','Geintegreerde graphics':'Ja','Verkoopstatus (CPU)':'Boxed','Nominale snelheid videochip':'350MHz','CPU Cache Level 1 ':'8x 32KB','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'4,4GHz','Procestechnologie':'22 nm','Thermal Design Power':'88W','url':'http://tweakers.net/pricewatch/394885/intel-core-i7-4790k-boxed/','CPU stepping':'C0','Virtualisatie':'Ja','Merk':'Intel','Eerste prijsvermelding':'woensdag 4 juni 2014','Bijzonderheden':'Unlocked multiplier'}}";

//		public void hahaha() throws JSONException {
//			
//
//			
//		}
		//public void testje() {
		
		//	String jays = "'gpu':{'SKU':'912-V284-081, N760 TF 2GD5/OC, N760 TF-2GD5/OC, V284-081R','Hoogste HDMI-versie':'HDMI 1.4','Uitvoering':'2GB Gaming (N760 TF 2GD5/OC)','Beoordeling':' (57 reviews)','Geheugengrootte':'2GB','Aantal aanbieders':'34 winkels','Videochipfabrikant':'Nvidia','Geheugen Busbreedte':'256 bit','EAN':'0816909108637, 4719072301576','Chipset generatie':'GeForce 700 Serie','OpenGL versie':'4.3','Type koeling':'Actieve fan','Tweakers ID':'339487','Aantal slots':'2x','Lengte':'260mm','Hoogste DisplayPort versie':'DisplayPort 1.2','Laagste prijs':' ','Maximale resolutie':'4096x2160 (Cinema 4K)','Geheugen Type (videokaarten)':'GDDR5','Aantal pins (videokaarten)':'6 pins, 8 pins','Aantal 6 pins':'1x','Verkoopstatus':'Retail','Product':'MSI GeForce GTX 760','Link Interface':'Nvidia SLi','Nominale snelheid videochip':'1,085GHz','Aantal 8 pins':'1x','Video uit':'DisplayPort, DVI-D, DVI-I, HDMI','Card Interface (Video)':'PCI-e 3.0 x16','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'1,15GHz','url':'http://tweakers.net/pricewatch/339487/msi-geforce-gtx-760-2gb-gaming-(n760-tf-2gd5-oc)/','Geheugen Snelheid':'6,008GHz','Shader model':'5.0','Rekenkernen':'1.152','Merk':'MSI','Eerste prijsvermelding':'woensdag 26 juni 2013','Bijzonderheden':'DirectX feature level 11_0','DirectX versie':'11.1','Videochip':'GeForce GTX 760'},'cpu':{'SKU':'BX80646I74790K, BXF80646I74790K','Maximale snelheid videochip':'1,25GHz','CPU Instructieset':'AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, XD','Virtualisatie type':'Intel VT-d, Intel VT-x','Aantal aanbieders':'38 winkels','Snelheid':'4GHz','Beoordeling':' (16 reviews)','CPU Multiplier':'40','Gp':'Intel HD Graphics 4600','CPU Cache Level 3':'8MB','CPU Cache Level 2':'4x 256KB','Product':'Intel Core i7-4790K','Bus snelheid':'QuickPath 1x 5 GT/s','EAN':'0735858285957, 5032037065948, 5032037066181','Geheugen Specificatie':'PC3-12800 (DDR3-1600)','CPU sSpec Number':'SR219','Aantal cores':'Quad Core','Serie':'Core i7','Type koeling':'Actieve fan','Threads':'8x','Tweakers ID':'394885','Laagste prijs':' ','Socket':'1150','Geintegreerde graphics':'Ja','Verkoopstatus (CPU)':'Boxed','Nominale snelheid videochip':'350MHz','CPU Cache Level 1 ':'8x 32KB','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'4,4GHz','Procestechnologie':'22 nm','Thermal Design Power':'88W','url':'http://tweakers.net/pricewatch/394885/intel-core-i7-4790k-boxed/','CPU stepping':'C0','Virtualisatie':'Ja','Merk':'Intel','Eerste prijsvermelding':'woensdag 4 juni 2014','Bijzonderheden':'Unlocked multiplier'}";
			
		//	jays = jays.replaceAll("},", "}},");
			
		
		//	String[] tokens = jays.split("},");
		//	
			
			//	for (int i =0; i < tokens.length; i++) {
					
			//		System.out.println(tokens[i] + "\n"); 
					
			//	}
				
		//}/
		
		public void hoi() {
			ArrayList<String> testAR = new ArrayList<String>();
			
			String hoitest = "HAAI";
			testAR.add(hoitest);
			
			
			System.out.println(testAR);
		}
		
		
		
		
		
		public void Start() throws JSONException {
			jsonMeth();
		}
		
		public String cpuStringJSONObject;
		public String gpuStringJSONObject;
		public String ramStringJSONObject;
		public String hddStringJSONObject;
		public String ssdStringJSONObject;
		public String psuStringJSONObject;
		public String caseStringJSONObject;
		public String motherboardStringJSONObject;
		public String opticaldriveStringJSONObject;
		public String soundcardStringJSONObject;
		
	
		public void jsonMeth() throws JSONException {		
		
			
			UserRequest user = new UserRequest();
			
			String userInputJSON = user.getParsedJSONString();
			JSONObject j = new JSONObject(userInputJSON);
			cpuStringJSONObject = j.optString("cpu");
			gpuStringJSONObject = j.optString("gpu");
			ramStringJSONObject = j.optString("ram");
			hddStringJSONObject = j.optString("hdd");
			ssdStringJSONObject = j.optString("ssd");
			psuStringJSONObject = j.optString("psu");
			caseStringJSONObject = j.optString("case");
			motherboardStringJSONObject = j.optString("motherboard");
			opticaldriveStringJSONObject = j.optString("opticaldrive");
			soundcardStringJSONObject = j.optString("soundcard");
			
		
			if (cpuStringJSONObject.isEmpty()) {
				cpuStringJSONObject = null;
			}
						
			if (gpuStringJSONObject.isEmpty()) {
				cpuStringJSONObject = null;
			}
			
			if (ramStringJSONObject.isEmpty()) {
				ramStringJSONObject = null;
			}
			
			if (hddStringJSONObject.isEmpty()) {
				hddStringJSONObject = null;
			}
			
			if (ssdStringJSONObject.isEmpty()) {
				ssdStringJSONObject = null;
			}
			
			if (psuStringJSONObject.isEmpty()) {
				psuStringJSONObject = null;
			}
			
			if (caseStringJSONObject.isEmpty()) {
				caseStringJSONObject = null;
			}
			
			if (motherboardStringJSONObject.isEmpty()) {
				motherboardStringJSONObject = null;
			}
			
			if (opticaldriveStringJSONObject.isEmpty()) {
				opticaldriveStringJSONObject = null;
			}
			
			if (soundcardStringJSONObject.isEmpty()) {
				soundcardStringJSONObject = null;
			}
			
			

			JSONStringsArrayList.add(cpuStringJSONObject);
			JSONStringsArrayList.add(gpuStringJSONObject);
			JSONStringsArrayList.add(ramStringJSONObject);
			JSONStringsArrayList.add(hddStringJSONObject);
			JSONStringsArrayList.add(ssdStringJSONObject);
			JSONStringsArrayList.add(psuStringJSONObject);
			JSONStringsArrayList.add(caseStringJSONObject);
			JSONStringsArrayList.add(motherboardStringJSONObject);
			JSONStringsArrayList.add(opticaldriveStringJSONObject);
			JSONStringsArrayList.add(soundcardStringJSONObject);
		}
		
			
		
		//System.out.println(JSONStringsArrayList + "\n");
		
		
		
		
		public ArrayList<String> getList() {
			
			return JSONStringsArrayList;
			
	}
}
