package com.contacts.MyContactList.entity;

import java.util.List;

public class CombinedData {
    public String fname;
    

    public List<PhoneNumberWithType> phoneNumber;


    public String email;





    public CombinedData(String personName, List<PhoneNumberWithType> phoneNumberWithTypes) {
        this.fname = personName;
        this.phoneNumber = phoneNumberWithTypes;
    }

    public List<PhoneNumberWithType> getPhoneNumberWithTypes() {
        return phoneNumber;
    }

    public void setPhoneNumberWithTypes(List<PhoneNumberWithType> phoneNumberWithTypes) {
        this.phoneNumber = phoneNumberWithTypes;
    }
//Getters and Setters

    public String getPersonName() {
        return fname;
    }

    public void setPersonName(String personName) {
        this.fname = personName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public List<PhoneNumberWithType> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<PhoneNumberWithType> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getPhoneType() {
//        return phoneType;
//    }
//
//    public void setPhoneType(String phoneType) {
//        this.phoneType = phoneType;
//    }
}
