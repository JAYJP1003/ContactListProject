package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDetailsDao;
import com.contacts.MyContactList.entity.ContactDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactdetailsServiceImpl implements ContactDetailsService{
    @Autowired
    private ContactDetailsDao contactDetailsDao;
    @Override
    public List<ContactDetails> getAllContacts() {
        return contactDetailsDao.findAll();
    }
}
