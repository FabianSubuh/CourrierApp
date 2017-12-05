/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class ResiGen {
//       public static void main(String[] args) {
//        String no = generateNoResi();
//           System.out.println("args = " + no);
//    }
    public static String generateNoResi(){
        String noResi = "";
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyy");
        
        String kw= sdf.format(date);
        int code = (int) (Math.ceil(Math.random() * 1000) * 1);
        int code2 = (int) (Math.ceil(Math.random() * 1000) * 1);
//        if(destination.equalsIgnoreCase("Bandung")){
//            noResi = "BDG"+code+code2;
//        }
        noResi +="CAP"+ code + kw + code2;
        return noResi;
    }
    
}
