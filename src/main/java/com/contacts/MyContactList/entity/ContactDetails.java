package com.contacts.MyContactList.entity;

public class ContactDetails {

    private String phoneNumber;

    private int personId;

    public ContactDetails(){};

    public ContactDetails(String phoneNumber, int personId) {
        this.phoneNumber = phoneNumber;
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", personId=" + personId +
                '}';
    }
}
