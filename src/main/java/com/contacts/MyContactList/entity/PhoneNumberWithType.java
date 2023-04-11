package com.contacts.MyContactList.entity;

public class PhoneNumberWithType {
    public String number;
    public String ptype;

    public PhoneNumberWithType(String number, String ptype) {
        this.number = number;
        this.ptype = ptype;
    }

    public String getPhoneNumber() {
        return number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.number = phoneNumber;
    }

    public String getPhoneType() {
        return ptype;
    }

    public void setPhoneType(String phoneType) {
        this.ptype = phoneType;
    }
}
