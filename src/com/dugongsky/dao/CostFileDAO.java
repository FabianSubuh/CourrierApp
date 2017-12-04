/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.dao;

import com.dugongsky.model.MasterCourrier;
import com.dugongsky.model.Packages;
import java.util.List;

/**
 *
 * @author BIAN
 */
public class CostFileDAO {

    private final Double insurancePrecentage = 0.03;
//    public double calcInsurance(){
//    double totalInsurance=0.0;
//    return totalInsurance;
//    }
    public Double calcCost(Packages packages) {
        Double totalCost = 0.0;
        Double costdest;
        Double weight = packages.getWeights();
        Double price = packages.getPrice();

        List<MasterCourrier> destcost = DestinationLib.getDestinationList();
        for (MasterCourrier masterCourrier : destcost) {

            if (masterCourrier.getDestination().equalsIgnoreCase(packages.getDestination())) {
                if (packages.getDeliveryType().equalsIgnoreCase("regular")) {
                    costdest = masterCourrier.getRegularServices();
                    if (packages.getInsurance()) {
                        totalCost += (costdest * weight) + (price * insurancePrecentage);
                    } else {
                        totalCost += costdest * weight;
                    }
                }

                if (packages.getDeliveryType().equalsIgnoreCase("kilat")) {
                    costdest = masterCourrier.getKilatServices();
                    if (packages.getInsurance()) {
                        totalCost += (costdest * weight) + (price * insurancePrecentage);
                    } else {
                        totalCost += costdest * weight;
                    }
                }

                if (packages.getDeliveryType().equalsIgnoreCase("ons")) {
                    costdest = masterCourrier.getOverNightService();
                    if (packages.getInsurance()) {
                        totalCost += (costdest * weight) + (price * insurancePrecentage);
                    } else {
                        totalCost += costdest * weight;
                    }
                }

                if (packages.getDeliveryType().equalsIgnoreCase("sds")) {
                    costdest = masterCourrier.getSameDayServices();
                    if (packages.getInsurance()) {
                        totalCost += (costdest * weight) + (price * insurancePrecentage);
                    } else {
                        totalCost += costdest * weight;
                    }
                }

                if (packages.getDeliveryType().equalsIgnoreCase("hds")) {
                    costdest = masterCourrier.getHoliDayServices();
                    if (packages.getInsurance()) {
                        totalCost += (costdest * weight) + (price * insurancePrecentage);
                    } else {
                        totalCost += costdest * weight;
                    }
                }
            }

        }

        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
