
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.HashMap"
        %>

<%
HashMap<String,String> date1 = 
       new HashMap<String,String>();
date1.put("1", "AAA");
date1.put("hello","world");
date1.put("soeda","33");
date1.put("20", "20");

out.print(date1);

%>
