/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author itoga
 */
public class hiduke2 {
    public static void main(String[] args){
    
    Date now =new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日HH時:mm分:ss秒");
    
    System.out.print(sdf.format(now));
    
    }
}
