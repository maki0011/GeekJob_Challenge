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
public class keishou1 {

    public static void main(String[] args) {
        Teacher sensei = new Teacher();
        sensei.setHuman("蘭", 24);
        sensei.age = 35;
        sensei.hyouji();
        sensei.clear();
        sensei.hyouji();
    }
}

class Teacher extends Human {
    public void clear(){//nameとageをクリアするメソッド
        name ="名前なし";
        age=0;
//        System.out.println(name);
//        System.out.println(age);
    }

}
