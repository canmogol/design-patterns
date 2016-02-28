package com.fererlab.pattern.structural.adapter;

/**
 * Legacy code, we cannot change this class
 */
public class EmployeeLDAP {

    private String cn;
    private String surName;
    private String givenName;

    public EmployeeLDAP(String cn, String surName, String givenName) {
        this.cn = cn;
        this.surName = surName;
        this.givenName = givenName;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
