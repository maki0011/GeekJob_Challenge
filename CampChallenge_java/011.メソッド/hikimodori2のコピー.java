/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author itoga
 */
public class hikimodori2 extends HttpServlet {

    String[] profile(String id) {
        String[] pro1 = {"460", "桜", null, "geekjob"};
        String[] pro2 = {"222", "凛", "1980/11/15", null};
        String[] pro3 = {"530", "蘭", "2002/04/08", "camp"};
        String[] pro4 = {"そのIDは存在しません"};
        //==演算子　Stringオブジェクトが保持している参照を比較
        //equalsメソッド　Stringオブジェクトが管理している文字列を比較
        if (id.equals(pro1[0])) {
            return pro1;
        } else if (id.equals(pro2[0])) {
            return pro2;
        } else if (id.equals(pro3[0])) {
            return pro3;
        } else {
            return pro4;
        }

    }

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
//        String[] profi = profile("530");
//        if(profi.length==1){out.print(profi[0]);}
//        else{
//        for(int i=1;i<profi.length;i++){
//            out.print(profi[i]);
//        }
//        }
            String[] id = {"460", "222", "530"};

//            for (int i = 0; i < id.length; i++) {
//                String[] profi = profile(id[i]);
//                for (int n = 1; n < profi.length; n++) {
//                    if (profi[n] == null) {
//                        continue;
//                    }
//                    out.print(profi[n]);
//                }
//                
//            }
            for (String i : id) { //拡張for文
                String[] profi = profile(i);
                for (int n = 1; n < profi.length; n++) {
                    if (profi[n] == null) {
                        continue;
                    }
                    out.print(profi[n]);
                }

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
