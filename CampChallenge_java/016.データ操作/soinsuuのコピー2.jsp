<%-- 
    Document   : soinsuu
    Created on : 2017/10/27, 11:19:57
    Author     : itoga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList;" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>素因数分解</title>
    </head>
    <body>
        <h1 style="color: red">素因数分解結果</h1>
    </body>
</html>

<%
//クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
//元の値と素因数分解の結果を表示するようにしてください。
//2ケタ以上の素数が含まれた数値の場合は、
//「元の値　1ケタの素因数　余った値」と表記してください。 
    request.setCharacterEncoding("UTF-8");

    ArrayList<Integer> result = new ArrayList<Integer>();

    out.print("入力した値は" + request.getParameter("number") + "<br>");

    int number = Integer.parseInt(request.getParameter("number"));
    int[] i = {2, 3, 5, 7};

    for (int n = 0; n < i.length; n++) {
        while (number % i[n] == 0) {
            out.print(i[n] + "×");
            number = number / i[n];
            result.add(i[n]);
        }
        if (number % i[n] != 0 && n == i.length - 1) {//i[2,3,5,7]で割り切れなくなったら表示とbreak
            out.println(number);
            break;
        }

    }
    if(number==1){
    out.println("<br>"+request.getParameter("number")+"＝"+result);
    }
    else{out.println("<br>"+request.getParameter("number")+"＝"+result+"余った値は"+number);}

%>
