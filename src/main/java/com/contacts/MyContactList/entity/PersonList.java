package com.contacts.MyContactList.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contactlist")
public class PersonList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int personId;
    @Column(name = "person_name")
    private String personName;

    @OneToMany(mappedBy = "personList", cascade = CascadeType.ALL)
    private List<ContactDetails> contactDetails;

    public PersonList() {
        super();
    }

    public PersonList(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }


}
