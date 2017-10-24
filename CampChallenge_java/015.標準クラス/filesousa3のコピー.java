/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.dbclass;

import java.io.*;
import java.util.Date;
import java.util.Collection;
import java.util.ArrayList;
/**
 * １つJAVAの標準クラスを選び、実際にロジックを作成してみてください。 1. 処理の経過を書き込むログファイルを作成する。
 * 2.処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。 3. 書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
 * 4.最後に、ログファイルを読み込み、その内容を表示
 *
 * @author itoga
 */
public class filesousa3 {

    public static void main(String[] args) throws IOException {

        Date time = new Date();
        File log = new File("ログファイル");
        FileWriter fw = new FileWriter(log,true);

        fw.write(time + "に処理を開始しました。");
        fw.close();
        
        Collection<Integer> num = new ArrayList<>();
       for(int i=1;i<11;i++){ 
        num.add(i);
        num.add(i*i);
        System.out.println(num);
        System.out.println(num.isEmpty());//空かどうかfalse
        if(i==10){
            Date time1 = new Date();
      
        File log1 = new File("ログファイル");
        FileWriter fw1 = new FileWriter(log1,true);
        fw1.write(time1 + "に処理を終了しました。");
        fw1.close(); }
       }
              
     
        FileReader fr = new FileReader(log);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine()); //１行目読む
        fr.close();
        
        File log2 =new File("ログファイル");
        FileWriter fw2 = new FileWriter(log2);
        fw2.write("");//初期化
        fw2.close();
        
    }

}
