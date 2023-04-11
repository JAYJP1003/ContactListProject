package com.contacts.MyContactList.service;

import com.contacts.MyContactList.entity.ContactDetails;

import java.util.List;

public interface ContactDetailsService {

    public List<ContactDetails> getAllContacts();

    List<ContactDetails> getContactsOfPerson(int personId);

//    List <ContactDetails> getBasicPersonalDetails();
}
