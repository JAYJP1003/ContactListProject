package com.contacts.MyContactList.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@IdClass(ContactId.class)
@Table(name = "contactdetails")
public class ContactDetails{

    @Id
    @Column(name = "phone_number")
    private String phoneNumber;

    @Id
    @Column(name = "person_id")
    private int personId;

    @Column(name="type")
    private String phoneType;

    @Column(name="email")
    private String email;

//    @Column(name="photoUrl")
//    private String photourl;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", insertable = false, updatable = false)
    private PersonList personList;

    public ContactDetails(){};

    public ContactDetails(String phoneNumber, int personId, String phoneType, String email,  PersonList personList) {
        this.phoneNumber = phoneNumber;
        this.personId = personId;
        this.phoneType = phoneType;
        this.email = email;
        this.personList = personList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PersonList getPersonList() {
        return personList;
    }

    public void setPersonList(PersonList personList) {
        this.personList = personList;
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", personId=" + personId +
                ", phoneType='" + phoneType + '\'' +
                ", email='" + email + '\'' +
                ", personList=" + personList +
                '}';
    }
}
