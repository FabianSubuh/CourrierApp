/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.dao;

import com.dugongsky.model.MasterCourrier;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DestinationLib {
    public static List<MasterCourrier> getDestinationList(){
        List<MasterCourrier> destinationList= new ArrayList<>();
        try {
            //Scanner scan=new Scanner(new File("E:/FileTarif.txt"));
            Scanner scan=new Scanner(new File(DestinationLib.class.getResource("/com/dugongsky/asset/FileTarif.txt").getFile()));
            while (scan.hasNextLine()) {
                MasterCourrier courrier= new MasterCourrier();
                String line=scan.nextLine();
                String[]data=line.split(",");
                //setDestination
                String tujuan =data[0];
                courrier.setDestination(tujuan);
                //set tipe Paket
                courrier.setRegularServices(Double.parseDouble(data[1]));
                courrier.setKilatServices(Double.parseDouble(data[2]));
                courrier.setOverNightService(Double.parseDouble(data[3]));
                courrier.setHoliDayServices(Double.parseDouble(data[4]));
                courrier.setSameDayServices(Double.parseDouble(data[5]));
                destinationList.add(courrier);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DestinationLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destinationList;
    } 
    
}
