
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
<%
    request.setCharacterEncoding("UTF-8");
    out.print("名前は" + request.getParameter("txtName") + "<br>");
    
    if ("man".equals(request.getParameter("rdoMan"))) {
        out.print("男性です"+"<br>");
    }
    else
    {out.print("女性です"+"<br>");
    }
    
    
    out.print("趣味は" + request.getParameter("Shumi") + "<br>");


%>