<%-- 
    Document   : QueryString
    Created on : 2017/10/25, 10:49:58
    Author     : itoga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    if ("魚".equals(request.getParameter("type1"))) {
        out.print("魚は生鮮食品です" + "<br>");
    } else if ("野菜".equals(request.getParameter("type1"))) {
        out.print("野菜は生鮮食品です" + "<br>");
    } else if ("花瓶".equals(request.getParameter("type1"))) {
        out.print("花瓶は雑貨です<br>");
    }
    
    
    out.print("商品の金額は" + request.getParameter("price") + "円<br>");

    int total = Integer.parseInt(request.getParameter("price"));//StringをIntegerに変換する
    int number = Integer.parseInt(request.getParameter("number"));
    
    out.print(number+"個の購入で合計は"+total*number + "円です<br>");
    
    if (total >= 5000) {
        out.print("商品金額の5%の" + total * number * 0.05 + "ポイント付与いたします！");
    } else if (total >= 3000) {
        out.print("商品金額の4%の" + total * number * 0.04 + "ポイント付与いたします！");
    }
    else {
        out.print("申し訳ありませんがポイントの付与はありません");
//        out.print("商品金額の3%の" + total * number * 0.03 + "ポイント付与いたします！");
    }

%>
