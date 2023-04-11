package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDao;
import com.contacts.MyContactList.dao.ContactDetailsDao;
import com.contacts.MyContactList.entity.ContactDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactdetailsServiceImpl implements ContactDetailsService{
    @Autowired
    private ContactDetailsDao contactDetailsDao;
    @Autowired
    private ContactDao contactDao;

//    Map<Object, String> map = new HashMap<>();
    @Override
    public List<ContactDetails> getAllContacts() {
        return contactDetailsDao.findAll();
    }

    public List<ContactDetails> getContactsOfPerson(int personId){
//        return contactDetailsDao.findByPersonId();
        return contactDetailsDao.findByColumnName(personId);
    }

//    @Override
//    public List<ContactDetails> getBasicPersonalDetails() {
//        return contactDetailsDao.getBasicDetails( personId);
//    }
}
