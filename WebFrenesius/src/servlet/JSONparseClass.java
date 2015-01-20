package servlet;


import java.sql.SQLException;
import java.util.ArrayList;

import servlet.UserRequest;
import main.PcBuilder;

import org.json.JSONException;
import org.json.JSONObject;



	public class JSONparseClass {

		/**
		 * 
		 */
		
		
		private static final long serialVersionUID = 1L;
		
		public static ArrayList JSONStringsArrayList = new ArrayList();
		
		
		//public void testje() {
		
		//	String jays = "'gpu':{'SKU':'912-V284-081, N760 TF 2GD5/OC, N760 TF-2GD5/OC, V284-081R','Hoogste HDMI-versie':'HDMI 1.4','Uitvoering':'2GB Gaming (N760 TF 2GD5/OC)','Beoordeling':' (57 reviews)','Geheugengrootte':'2GB','Aantal aanbieders':'34 winkels','Videochipfabrikant':'Nvidia','Geheugen Busbreedte':'256 bit','EAN':'0816909108637, 4719072301576','Chipset generatie':'GeForce 700 Serie','OpenGL versie':'4.3','Type koeling':'Actieve fan','Tweakers ID':'339487','Aantal slots':'2x','Lengte':'260mm','Hoogste DisplayPort versie':'DisplayPort 1.2','Laagste prijs':' ','Maximale resolutie':'4096x2160 (Cinema 4K)','Geheugen Type (videokaarten)':'GDDR5','Aantal pins (videokaarten)':'6 pins, 8 pins','Aantal 6 pins':'1x','Verkoopstatus':'Retail','Product':'MSI GeForce GTX 760','Link Interface':'Nvidia SLi','Nominale snelheid videochip':'1,085GHz','Aantal 8 pins':'1x','Video uit':'DisplayPort, DVI-D, DVI-I, HDMI','Card Interface (Video)':'PCI-e 3.0 x16','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'1,15GHz','url':'http://tweakers.net/pricewatch/339487/msi-geforce-gtx-760-2gb-gaming-(n760-tf-2gd5-oc)/','Geheugen Snelheid':'6,008GHz','Shader model':'5.0','Rekenkernen':'1.152','Merk':'MSI','Eerste prijsvermelding':'woensdag 26 juni 2013','Bijzonderheden':'DirectX feature level 11_0','DirectX versie':'11.1','Videochip':'GeForce GTX 760'},'cpu':{'SKU':'BX80646I74790K, BXF80646I74790K','Maximale snelheid videochip':'1,25GHz','CPU Instructieset':'AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, XD','Virtualisatie type':'Intel VT-d, Intel VT-x','Aantal aanbieders':'38 winkels','Snelheid':'4GHz','Beoordeling':' (16 reviews)','CPU Multiplier':'40','Gp':'Intel HD Graphics 4600','CPU Cache Level 3':'8MB','CPU Cache Level 2':'4x 256KB','Product':'Intel Core i7-4790K','Bus snelheid':'QuickPath 1x 5 GT/s','EAN':'0735858285957, 5032037065948, 5032037066181','Geheugen Specificatie':'PC3-12800 (DDR3-1600)','CPU sSpec Number':'SR219','Aantal cores':'Quad Core','Serie':'Core i7','Type koeling':'Actieve fan','Threads':'8x','Tweakers ID':'394885','Laagste prijs':' ','Socket':'1150','Geintegreerde graphics':'Ja','Verkoopstatus (CPU)':'Boxed','Nominale snelheid videochip':'350MHz','CPU Cache Level 1 ':'8x 32KB','Fabrieksgarantie':'3 jaar carry in','Maximale turbo frequentie':'4,4GHz','Procestechnologie':'22 nm','Thermal Design Power':'88W','url':'http://tweakers.net/pricewatch/394885/intel-core-i7-4790k-boxed/','CPU stepping':'C0','Virtualisatie':'Ja','Merk':'Intel','Eerste prijsvermelding':'woensdag 4 juni 2014','Bijzonderheden':'Unlocked multiplier'}";
			
		//	jays = jays.replaceAll("},", "}},");
			
		
		//	String[] tokens = jays.split("},");
			
			
			//	for (int i =0; i < tokens.length; i++) {
					
			//		System.out.println(tokens[i] + "\n"); 
					
			//	}
				
		//}

		public static void Start() throws JSONException {
			subStringingJSONObject();
		}
		
		
	
		public static void subStringingJSONObject() throws JSONException {
		
			String userInputJSONFromChosenParts = UserRequest.getParsedJSONString();
			JSONObject jsonObjectFromUser = new JSONObject(userInputJSONFromChosenParts);
			String tempCpu = jsonObjectFromUser.optString("cpu");
			String tempGpu = jsonObjectFromUser.optString("gpu");
			String tempRam = jsonObjectFromUser.optString("ram");
			String tempHdd = jsonObjectFromUser.optString("hdd");
			String tempSsd = jsonObjectFromUser.optString("ssd");
			String tempPsu = jsonObjectFromUser.optString("psu");
			String tempCase = jsonObjectFromUser.optString("case");
			String tempMobo = jsonObjectFromUser.optString("mob");
			String tempOpt = jsonObjectFromUser.optString("opt");
			String tempSound = jsonObjectFromUser.optString("sound");
			
			if (tempCpu.isEmpty()) {
				tempCpu = null;
			}
						
			if (tempGpu.isEmpty()) {
				tempGpu = null;
			}
			
			if (tempRam.isEmpty()) {
				tempRam = null;
			}
			
			if (tempHdd.isEmpty()) {
				tempHdd = null;
			}
			
			if (tempSsd.isEmpty()) {
				tempSsd = null;
			}
			
			if (tempPsu.isEmpty()) {
				tempPsu = null;
			}
			
			if (tempCase.isEmpty()) {
				tempCase = null;
			}
			
			if (tempMobo.isEmpty()) {
				tempMobo = null;
			}
	
			if (tempOpt.isEmpty()) {
				tempOpt = null;
			}
			
			if (tempSound.isEmpty()) {
				tempSound = null;
			}
		
			JSONStringsArrayList.add(0, tempCpu);
			JSONStringsArrayList.add(1, tempGpu);
			JSONStringsArrayList.add(2, tempRam);
			JSONStringsArrayList.add(3, tempHdd);
			JSONStringsArrayList.add(4, tempSsd);
			JSONStringsArrayList.add(5, tempPsu);
			JSONStringsArrayList.add(6, tempCase);
			JSONStringsArrayList.add(7, tempMobo);
			JSONStringsArrayList.add(8, tempOpt);
			JSONStringsArrayList.add(9, tempSound);
			String a = "";
			PcBuilder pcBuiler = new PcBuilder();
			ArrayList arr = new ArrayList();
			try {
				arr = pcBuiler.fullCheck(JSONStringsArrayList);
			} catch (SQLException e) {
				System.out.println("Abid");
				e.printStackTrace();
			}
			
		}
		
		public static void addTheChosenUserComponentsToArrayList() {
			
			try {
				Start();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			

//			System.out.println("PRNTING ARRAYLIST");
//			for(int i = 0; i<JSONStringsArrayList.size();i++){
//				System.out.println(JSONStringsArrayList.get(i)+"\n");
//			}
//			
//			
//			PcBuilder pcBuilder = new PcBuilder();
//			
//		
//				try {
//					pcBuilder.fullCheck(JSONStringsArrayList);
//				} catch (SQLException e) {
//					
//					e.printStackTrace();
//				}
	
		}
		
		public ArrayList<String> getJSONArrayListStringList() {
			
			return JSONStringsArrayList;
			
	}
		public ArrayList matchComponents(ArrayList components){
			
			return null;
		}
}
