/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dugongsky.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Packages {
   private String codePackage;
   private int weights;
   private double widths;
   private double lengths;
   private double heights;
   private int price;
   private String paymentMeyhod;
   private Date sendDate;
   

    public Packages() {
    }

    /**
     * @return the codePackage
     */
    public String getCodePackage() {
        return codePackage;
    }

    /**
     * @param codePackage the codePackage to set
     */
    public void setCodePackage(String codePackage) {
        this.codePackage = codePackage;
    }

    /**
     * @return the weights
     */
    public int getWeights() {
        return weights;
    }

    /**
     * @param weights the weights to set
     */
    public void setWeights(int weights) {
        this.weights = weights;
    }

    /**
     * @return the widths
     */
    public double getWidths() {
        return widths;
    }

    /**
     * @param widths the widths to set
     */
    public void setWidths(double widths) {
        this.widths = widths;
    }

    /**
     * @return the lengths
     */
    public double getLengths() {
        return lengths;
    }

    /**
     * @param lengths the lengths to set
     */
    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    /**
     * @return the heights
     */
    public double getHeights() {
        return heights;
    }

    /**
     * @param heights the heights to set
     */
    public void setHeights(double heights) {
        this.heights = heights;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the paymentMeyhod
     */
    public String getPaymentMeyhod() {
        return paymentMeyhod;
    }

    /**
     * @param paymentMeyhod the paymentMeyhod to set
     */
    public void setPaymentMeyhod(String paymentMeyhod) {
        this.paymentMeyhod = paymentMeyhod;
    }

    /**
     * @return the sendDate
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate the sendDate to set
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

   
}
