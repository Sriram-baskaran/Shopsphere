package com.jvlcode.Shopsphere.dto;

public class OrderCreated {
    public String getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    public OrderCreated(String referenceID) {
        this.referenceID = referenceID;
    }

    private String referenceID;
}
