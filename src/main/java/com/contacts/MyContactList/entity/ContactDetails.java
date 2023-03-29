package com.contacts.MyContactList.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contactdetails")
public class ContactDetails implements Serializable {

    @Id
    @Column(name = "phone_number")
    private String phoneNumber;

    @Id
    @Column(name = "person_id")

    private int personId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonList personList;

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
