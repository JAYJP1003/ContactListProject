package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDao;
import com.contacts.MyContactList.dao.ContactDetailsDao;
import com.contacts.MyContactList.entity.CombinedData;
import com.contacts.MyContactList.entity.ContactDetails;
import com.contacts.MyContactList.entity.PersonList;
import com.contacts.MyContactList.entity.PhoneNumberWithType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingDataServiceImpl implements SavingDataService{
    @Autowired
    private ContactDao contactDao;
    @Autowired
    private ContactDetailsDao contactDetailsDao;
    @Autowired
    PersonNameService personNameService;
    @Override
    public void saveData(CombinedData data) {

        System.out.println();
        System.out.println(data + "hello");
        PersonList personList = new PersonList();
        personList.setPersonName(data.getPersonName());

        contactDao.save(personList);

        for(PhoneNumberWithType phoneNumber: data.getPhoneNumberWithTypes()){

            ContactDetails contactDetails = new ContactDetails();

            contactDetails.setPhoneNumber(phoneNumber.getPhoneNumber());
            contactDetails.setPhoneType(phoneNumber.getPhoneType());
            contactDetails.setPersonId(personList.getPersonId());
            contactDetails.setEmail(data.getEmail());
            contactDetails.setPersonList(personList);

            System.out.println(contactDetails);

            contactDetailsDao.save(contactDetails);

            System.out.println("Data Added Successfully");
        }
    }


    @Override
    public void editData(CombinedData data, int pId) {

        System.out.println(data.getPhoneNumberWithTypes() + " Hello hello hello");

        PersonList personList = contactDao.findById(pId)
                .orElseThrow(() -> new RuntimeException("PersonList not found"));

        personList.setPersonName(data.getPersonName());

//        List<ContactDetails> clearContactDetails = contactDetailsDao.findByColumnName(pId);
//        clearContactDetails.clear();

          contactDetailsDao.deleteAllByPersonId(pId);

        for(PhoneNumberWithType phoneNumber: data.getPhoneNumberWithTypes()){

            ContactDetails contactDetails = new ContactDetails();

            contactDetails.setPhoneNumber(phoneNumber.getPhoneNumber());
            contactDetails.setPhoneType(phoneNumber.getPhoneType());
            contactDetails.setPersonId(pId);
            contactDetails.setEmail(data.getEmail());
            contactDetails.setPersonList(personList);

            System.out.println(contactDetails);

            contactDetailsDao.save(contactDetails);

            System.out.println("Data Added Successfully");
        }


    }
}
