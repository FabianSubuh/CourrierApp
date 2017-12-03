/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.main;

import com.dugongsky.dao.CostFileDAO;
import com.dugongsky.model.Packages;
import java.util.Date;

/**
 *
 * @author BIAN
 */
public class TestLogic {
  
    public static void main(String[] args) {
        // TODO code application logic here
 
        
        Packages package2 = new Packages();
        package2.setDeliveryType("regular");
        package2.setDestination("semarang");
        package2.setInsurance(false);
        package2.setCodePackage("1001");
        package2.setPrice(1000000.0);
        package2.setPaymentMeyhod("Cash");
        package2.setWeights(2.0);
        package2.setType("cash");
        package2.setSendDate(new Date());
        package2.setHeights(0.3);
        package2.setLengths(1.0);
        package2.setWidths(1.0);
        
        CostFileDAO costs = new CostFileDAO();
        double cost = costs.calcCost(package2);
        
        System.out.println("Biaya pengiriman ke: " + package2.getDestination() + " sebesar: " + cost);
    }
}
