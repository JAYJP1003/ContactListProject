package com.contacts.MyContactList.entity;

import javax.persistence.*;

@Entity
@Table(name = "contactlist")
public class PersonList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "person_name")
    private String personName;

    public PersonList() {
        super();
    }

    public PersonList(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
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
