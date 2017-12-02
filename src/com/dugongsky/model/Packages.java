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

    /**
     * @return the deliveryType
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * @param deliveryType the deliveryType to set
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * @return the insurance
     */
    public Boolean getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    private String codePackage;
    private String type;
    private double weights;
    private double widths;
    private double lengths;
    private double heights;
    private double price;
    private String paymentMeyhod;
    private Boolean insurance;
    private Date sendDate;
    private String destination;
    private String deliveryType;

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
    public double getWeights() {
        return weights;
    }

    /**
     * @param weights the weights to set
     */
    public void setWeights(double weights) {
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
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
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

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
