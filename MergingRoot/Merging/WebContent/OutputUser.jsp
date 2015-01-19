<%@ page language="java" import="java.util.*, java.lang.*" %>

 <%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	
			<%  
			
		// retrieve your list from the request, with casting 
		ArrayList<String> list = (ArrayList<String>) request.getAttribute("itemList");
		ArrayList<Object> obj2 = (ArrayList<Object>) request.getAttribute("objlist");

		// print the information about every category of the list
		for(String item : list) 
		{
		   System.out.println(item);
		}
		
		System.out.println(obj2);
		%>

</body>
</html>