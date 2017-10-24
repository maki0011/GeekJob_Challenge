/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.io.*;
/**
 *
 * @author itoga
 */
public class filesousa2 {
    public static void main(String[] args) throws IOException{
    File profile = new File("text.txt"); 
    
    FileReader fr = new FileReader(profile);
    BufferedReader br = new BufferedReader(fr);
    System.out.print(br.readLine()); //１行目読む
    
    fr.close();
    
    }
}
