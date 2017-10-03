
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
float i = 1000;
int count = 0;    
while(i>100){
    i /=2;
count++;
out.print(i);
} 
out.print(count);//1000,500,250,125の4回

%>