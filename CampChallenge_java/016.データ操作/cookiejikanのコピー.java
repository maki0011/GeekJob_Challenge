/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import javax.servlet.http.Cookie;
import java.net.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author itoga
 */
public class cookiejikan extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            クッキーに現在時刻を記録し、次にアクセスした際に、前回記録した日時を表示
//            Cookie c = new Cookie("Date","日付");
//            c.setMaxAge(3600);//60s*60で60m
//            response.addCookie(c);

            Cookie[] cs = request.getCookies();

            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String accessTime = sdf.format(now);
            Cookie date = new Cookie("date", URLEncoder.encode(accessTime, "UTF-8"));//Cookieの値に変数を格納するには？
            response.addCookie(date);
            if (cs != null) {
                for (int i = 0; i < cs.length; i++) {//拡張for文だとfor (Cookie cookie : cookies){}
                    if (cs[i].getName().equals("date")) {
                        String value = URLDecoder.decode(cs[i].getValue(),"UTF-8");
                        out.print("前回のアクセスは"+value);
                        break;
                        
                        //URLDecoder.decodeを使ってURLエンコードされたテキストをUTF-8にデコード
                        //エンコード "あああ"を%
                        //デコード　%を"あああ"文字列へ
                    }

                }
            } else {//クッキーに何もない時
                out.print("初回ログインです！");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
