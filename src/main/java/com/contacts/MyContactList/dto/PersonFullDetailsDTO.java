package com.contacts.MyContactList.dto;

import com.contacts.MyContactList.entity.PhoneNumberWithType;

import java.util.List;

public class PersonFullDetailsDTO {

    private String name;
    private List<PhoneNumberWithType> phoneDetails;
    private String email;

    public PersonFullDetailsDTO() {
    }

    public PersonFullDetailsDTO(String name, List<PhoneNumberWithType> phoneDetails, String email) {
        this.name = name;
        this.phoneDetails = phoneDetails;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PhoneNumberWithType> getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(List<PhoneNumberWithType> phoneDetails) {
        this.phoneDetails = phoneDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
