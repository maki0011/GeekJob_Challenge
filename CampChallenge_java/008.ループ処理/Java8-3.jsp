<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
int total = 0;

for(int i=1; i<101; i++ ){
    total +=i;
out.print(total + "<br>");
}

out.print(total);

%>