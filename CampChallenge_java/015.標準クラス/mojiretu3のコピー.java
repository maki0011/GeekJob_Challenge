/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

/**
 *
 * @author itoga
 */
public class mojiretu3 {
    public static void main(String[] args){
    String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
    String result1 = word.replaceAll("U", "う");
    String result2 = result1.replace("I", "い");
    System.out.println(result1);
    System.out.println(result2);
    }
}
