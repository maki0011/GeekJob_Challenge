
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
long result = 8;
for(int i=0; i<20; i++){
     result *=8;
}
out.print(result);
%>