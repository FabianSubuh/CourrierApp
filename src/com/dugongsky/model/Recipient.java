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
public class Recipient {
    private String name;
    private String recipientAddress;
    private String city;
    private String poscode;
    private String province;
    private String phoneRecipient;

    public Recipient() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the recipientAddress
     */
    public String getRecipientAddress() {
        return recipientAddress;
    }

    /**
     * @param recipientAddress the recipientAddress to set
     */
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the poscode
     */
    public String getPoscode() {
        return poscode;
    }

    /**
     * @param poscode the poscode to set
     */
    public void setPoscode(String poscode) {
        this.poscode = poscode;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the phoneRecipient
     */
    public String getPhoneRecipient() {
        return phoneRecipient;
    }

    /**
     * @param phoneRecipient the phoneRecipient to set
     */
    public void setPhoneRecipient(String phoneRecipient) {
        this.phoneRecipient = phoneRecipient;
    }
    
}
