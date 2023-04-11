package com.contacts.MyContactList.entity;

import java.io.Serializable;

public class ContactId implements Serializable {

    private String phoneNumber;
//    private PersonList personList;
    private int personId;
    public ContactId() {
    }

//    public ContactId(String phoneNumber, PersonList personList) {
//        this.phoneNumber = phoneNumber;
//        this.personList = personList;
//    }


    public ContactId(String phoneNumber, int personId) {
        this.phoneNumber = phoneNumber;
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public PersonList getPersonList() {
//        return personList;
//    }
//
//    public void setPersonList(PersonList personList) {
//        this.personList = personList;
//    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
