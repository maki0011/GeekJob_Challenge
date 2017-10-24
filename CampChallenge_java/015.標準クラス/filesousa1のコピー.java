/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.io.*;
//ファイル操作の時はioの下部分を使う
/**
 *
 * @author itoga
 */
public class filesousa1 {
    public static void main(String [] args) throws IOException{
        File profile = new File("text.txt");
    //ファイルを操作のため開く（Fileクラス
    FileWriter fw = new FileWriter(profile);
    fw.write("自己紹介です");
    fw.write("よろしくお願いします");
    fw.close();
     //ファイルへ書き込む（FileWriterクラス
    
    } 
}
