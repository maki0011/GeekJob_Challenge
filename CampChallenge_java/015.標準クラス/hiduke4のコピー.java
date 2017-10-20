/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author itoga
 */
public class hiduke4 {

    public static void main(String[] args) {

        Date day1 = new Date(115, 1, 1, 0, 0, 0);
        Date day2 = new Date(115, 12, 31, 23, 59, 59);
        System.out.println(day2.getTime() - day1.getTime());
        System.out.println(day2);
        System.out.println(day1);

//        Calendar c1 = Calendar.getInstance();
//        c1.set(2015, 1, 1, 0, 0, 0);
//        Calendar c2 = Calendar.getInstance();
//        c2.set(2015, 12, 31, 23, 59, 59);
//        System.out.println(c2.getTime());

    }
}
