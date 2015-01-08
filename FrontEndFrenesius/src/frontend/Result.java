package frontend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Result() {
        super();
    }

    
    public static String[] compo;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String longStringVanMo = "model: ‘{‘gpu’:{‘SKU’:’90YV07F0-M0NA00, 90YV07F0-M0NM00, STRIX-GTX970-DC2OC-4GD5’,’Hoogte’:’40mm’,’Hoogste HDMI-versie’:’HDMI 2.0’,’Uitvoering’:’Asus STRIX-GTX970-DC2OC-4GD5’,’Beoordeling’:’ (15 reviews)’,’Geheugengrootte’:’4GB’,’Stroomverbruik’:’225W’,’Videochipfabrikant’:’Nvidia’,’Geheugen Busbreedte’:’256 bit’,’EAN’:’4716659895060, 8862278950690’,’Chipset generatie’:’GeForce 900 Serie’,’OpenGL versie’:’4.4’,’Type koeling’:’Passieve fan’,’Tweakers ID’:’416129’,’Aantal slots’:’2x’,’Card Interface (Video)’:’PCI-e 3.0 x16’,’Laagste prijs’:’ ‘,’Maximale resolutie’:’4096x2160 (Cinema 4K)’,’Geheugen Type (videokaarten)’:’GDDR5’,’Aantal pins (videokaarten)’:’8 pins’,’Aantal aanbieders’:’19 winkels’,’Verkoopstatus’:’Retail’,’Link Interface’:’Nvidia SLi’,’Nominale snelheid videochip’:’1,114GHz’,’Aantal 8 pins’:’1x’,’Video uit’:’DisplayPort, DVI-D, DVI-I, HDMI’,’Lengte’:’280mm’,’Fabrieksgarantie’:’3 jaar carry in’,’Maximale turbo frequentie’:’1,253GHz’,’url’:’http://tweakers.net/pricewatch/416129/asus-strix-gtx970-dc2oc-4gd5/’,’Geheugen Snelheid’:’7,01GHz’,’Shader model’:’5.0’,’Rekenkernen’:’1.664’,’Merk’:’Asus’,’Eerste prijsvermelding’:’zaterdag 20 september 2014’,’Bijzonderheden’:’Passieve Fan tot 65\\xb0C’,’Breedte’:’140mm’,’DirectX versie’:’12.0’,’Videochip’:’GeForce GTX 970’}}’[14:03:33] mo mo: ‘{‘gpu’:{‘SKU’:’90YV07F0-M0NA00, 90YV07F0-M0NM00, STRIX-GTX970-DC2OC-4GD5’,’Hoogte’:’40mm’,’Hoogste HDMI-versie’:’HDMI 2.0’,’Uitvoering’:’Asus STRIX-GTX970-DC2OC-4GD5’,’Beoordeling’:’ (15 reviews)’,’Geheugengrootte’:’4GB’,’Stroomverbruik’:’225W’,’Videochipfabrikant’:’Nvidia’,’Geheugen Busbreedte’:’256 bit’,’EAN’:’4716659895060, 8862278950690’,’Chipset generatie’:’GeForce 900 Serie’,’OpenGL versie’:’4.4’,’Type koeling’:’Passieve fan’,’Tweakers ID’:’416129’,’Aantal slots’:’2x’,’Card Interface (Video)’:’PCI-e 3.0 x16’,’Laagste prijs’:’ ‘,’Maximale resolutie’:’4096x2160 (Cinema 4K)’,’Geheugen Type (videokaarten)’:’GDDR5’,’Aantal pins (videokaarten)’:’8 pins’,’Aantal aanbieders’:’19 winkels’,’Verkoopstatus’:’Retail’,’Link Interface’:’Nvidia SLi’,’Nominale snelheid videochip’:’1,114GHz’,’Aantal 8 pins’:’1x’,’Video uit’:’DisplayPort, DVI-D, DVI-I, HDMI’,’Lengte’:’280mm’,’Fabrieksgarantie’:’3 jaar carry in’,’Maximale turbo frequentie’:’1,253GHz’,’url’:’http://tweakers.net/pricewatch/416129/asus-strix-gtx970-dc2oc-4gd5/’,’Geheugen Snelheid’:’7,01GHz’,’Shader model’:’5.0’,’Rekenkernen’:’1.664’,’Merk’:’Asus’,’Eerste prijsvermelding’:’zaterdag 20 september 2014’,’Bijzonderheden’:’Passieve Fan tot 65\\xb0C’,’Breedte’:’140mm’,’DirectX versie’:’12.0’,’Videochip’:’GeForce GTX 970’},’cpu’:{‘SKU’:’BX80646I54460’,’Maximale snelheid videochip’:’1,1GHz’,’CPU Instructieset’:’AES, AVX, AVX2, EM64T, MMX, NX-bit, SSE, SSE2, SSE3, SSE4, SSE4.1, SSE4.2, SSSE3, x86-64, XD’,’Virtualisatie type’:’Intel VT-d, Intel VT-x’,’Aantal aanbieders’:’33 winkels’,’Snelheid’:’3,2GHz’,’Beoordeling’:’ (5 reviews)’,’CPU Multiplier’:’31’,’Gp’:’Intel HD Graphics 4600’,’CPU Cache Level 3’:’6MB’,’CPU Cache Level 2’:’4x 256KB’,’Product’:’Intel Core i5-4460’,’Bus snelheid’:’166MHz’,’EAN’:’0675901277945, 5032037062763’,’Geheugen Specificatie’:’PC3-12800 (DDR3-1600)’,’CPU sSpec Number’:’SR1QK’,’Aantal cores’:’Quad Core’,’Serie’:’Core i5’,’Type koeling’:’Actieve fan’,’Threads’:’4x’,’Tweakers ID’:’385757’,’Laagste prijs’:’ ‘,’Socket’:’1150’,’Ge\\xefntegreerde graphics’:’Ja’,’Verkoopstatus (CPU)’:’Boxed’,’Nominale snelheid videochip’:’350MHz’,’CPU Cache Level 1 ‘:’8x 32KB’,’Maximale turbo frequentie’:’3,4GHz’,’Procestechnologie’:’22 nm’,’Thermal Design Power’:’84W’,’url’:’http://tweakers.net/pricewatch/385757/intel-core-i5-4460-boxed/’,’CPU stepping’:’C0’,’Virtualisatie’:’Ja’,’Merk’:’Intel’,’Eerste prijsvermelding’:’woensdag 14 mei 2014’}}’";
		
		compo = request.getParameterValues("checkboxParts");
		
		PrintWriter out = response.getWriter();
		
		for (int i	= 0; i < compo.length; i++) {
		
			out.println("<h1>" + compo[i] + "</h1>");
				
		}
		
		out.println(longStringVanMo);
	}
	
	public static String[] getArray () {
		return compo;		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
