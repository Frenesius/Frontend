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
		
		compo = request.getParameterValues("checkboxParts");
		
		PrintWriter out = response.getWriter();
		
		for (int i	= 0; i < compo.length; i++) {
		
			out.println("<h1>" + compo[i] + "</h1>");
				
		}
		
	}
	
	public static String[] getArray () {
		return compo;		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
