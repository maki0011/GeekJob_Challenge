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
public class classsakusei1 {

    public static void main(String[] args) {
        Human hito = new Human();
//        hito.age = 35;
        hito.setHuman("桜",17);
    }
}

class Human {

    public String name = "";
    public int age = 0;

    public void setHuman(String n, int a) {
        this.name = n;
        this.age = a;
        System.out.println(name);
        System.out.println(age);
    }
}
