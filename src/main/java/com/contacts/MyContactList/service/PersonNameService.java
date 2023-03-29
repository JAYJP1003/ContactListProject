package com.contacts.MyContactList.service;

import com.contacts.MyContactList.entity.PersonList;

import java.util.List;

public interface PersonNameService {
    public List<PersonList> getPersonList();

    public PersonList getPersonName(int personId);

    public PersonList addPersonName(PersonList personList);

    public PersonList updatePersonName(PersonList personList, int pId);

    public void deletePersonName(int parseInt);
}
