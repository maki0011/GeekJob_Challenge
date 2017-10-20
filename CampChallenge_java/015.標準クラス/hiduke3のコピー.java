/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java

/**
 *
 * @author itoga
 */
public class hiduke3 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日HH時:mm分:ss秒");
//        Calendar c = Calendar.getInstance();
//        c.set(2016,10,4,10,0,0);
//        System.out.println(c.getTime());
        
        
        Date day = new Date(116,10,4,10,0,0); //Dateだと1900年分増えてしまうのでCalendarを使う
        System.out.println(day);
        System.out.println(sdf.format(day));
    }
}
