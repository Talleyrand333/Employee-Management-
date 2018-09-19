/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newdbproject2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author user
 */
public  class Create_regNo {
    public static String regNo(){
        Random ran = new Random();
        int[] dd={0,1,2,3,4,5,6,7,8,9};
        int ddd[]={10,12,34,54,65};
        int gstno =ran.nextInt(ddd.length);
        String dd1=String.valueOf(ran.nextInt(dd.length));
        String dd2=String.valueOf(ran.nextInt(dd.length));
        String dd3=String.valueOf(ran.nextInt(dd.length));
        String dd4=String.valueOf(ran.nextInt(dd.length));
        String dall=dd1+dd2+dd3+dd4;
        
        String ddall=String.valueOf(ddd[gstno]);
        String[] alpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int num1;
        int num2;
        num1= ran.nextInt(alpha.length);
        num2=ran.nextInt(alpha.length);
        String a1=alpha[num1];
        String a2=alpha[num2];
        String a3=a1+a2;
        String nana=a3+dall;
        return nana;
    }
    public static void main(String[] args) {
//    Date now1=new Date();
//    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//    String d1=sdf.format(now1);
//    String s1="2018-07-28";
//    if(d1.equals(s1)){
//        System.out.println("They are the same");
//    }
//    else{
//        System.out.println("They are not the same");
//    }    
String asd=regNo();
String asf=regNo();
        System.out.println(asd);
        System.out.println(asf);
}
}
