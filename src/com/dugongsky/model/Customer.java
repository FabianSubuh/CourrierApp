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
public class Customer {
    private String name;
    private String customerAddress;
    private String city;
    private String poscode;
    private String province;
    private String phoneCustomer;

    public Customer() {
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
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
     * @return the phoneCustomer
     */
    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    /**
     * @param phoneCustomer the phoneCustomer to set
     */
    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }
}
