/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.model;

/**
 *
 * @author user
 */
public class MasterCourrier {

    private String destination;
    private double regularServices;
    private double kilatServices;
    private double overNightService;
    private double holiDayServices; 
    private double sameDayServices;

    public MasterCourrier() {
    }

    /**
     * @return the deliveryType
     */

    /**
     * @param deliveryType the deliveryType to set
     */

    /**
     * @return the insurance
     */

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @return the regularServices
     */
    public double getRegularServices() {
        return regularServices;
    }

    /**
     * @param regularServices the regularServices to set
     */
    public void setRegularServices(double regularServices) {
        this.regularServices = regularServices;
    }

    /**
     * @return the kilatServices
     */
    public double getKilatServices() {
        return kilatServices;
    }

    /**
     * @param kilatServices the kilatServices to set
     */
    public void setKilatServices(double kilatServices) {
        this.kilatServices = kilatServices;
    }

    /**
     * @return the overNightService
     */
    public double getOverNightService() {
        return overNightService;
    }

    /**
     * @param overNightService the overNightService to set
     */
    public void setOverNightService(double overNightService) {
        this.overNightService = overNightService;
    }

    /**
     * @return the holiDayServices
     */
    public double getHoliDayServices() {
        return holiDayServices;
    }

    /**
     * @param holiDayServices the holiDayServices to set
     */
    public void setHoliDayServices(double holiDayServices) {
        this.holiDayServices = holiDayServices;
    }

    /**
     * @return the sameDayServices
     */
    public double getSameDayServices() {
        return sameDayServices;
    }

    /**
     * @param sameDayServices the sameDayServices to set
     */
    public void setSameDayServices(double sameDayServices) {
        this.sameDayServices = sameDayServices;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
