package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDao;
import com.contacts.MyContactList.dao.ContactDetailsDao;
import com.contacts.MyContactList.dto.PersonBasicDetailsDTO;
import com.contacts.MyContactList.dto.PersonFullDetailsDTO;
import com.contacts.MyContactList.entity.ContactDetails;
import com.contacts.MyContactList.entity.PersonList;
import com.contacts.MyContactList.entity.PhoneNumberWithType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GettingDataServiceImpl implements GettingDataService {

    @Autowired
    private final ContactDao contactDao;
    @Autowired
    private final ContactDetailsDao contactDetailsDao;

    public GettingDataServiceImpl(ContactDao contactDao, ContactDetailsDao contactDetailsDao) {
        this.contactDao = contactDao;
        this.contactDetailsDao = contactDetailsDao;
    }

    @Override
    public List<PersonBasicDetailsDTO> getBasicDetails() {
        List<PersonList> persons = contactDao.findAll();
        List<PersonBasicDetailsDTO> personDTOs = new ArrayList<>();

        for(PersonList person: persons){
            System.out.println(person.getPersonId());
            ContactDetails contact = contactDetailsDao.getBasicDetails(person.getPersonId());
            System.out.println(contact);
            PersonBasicDetailsDTO personBasicDetailsDTO = new PersonBasicDetailsDTO();

            personBasicDetailsDTO.setName(person.getPersonName());
            personBasicDetailsDTO.setPhoneNumber(contact.getPhoneNumber());
            personBasicDetailsDTO.setEmail(contact.getEmail());
            personBasicDetailsDTO.setId(person.getPersonId());
            personDTOs.add(personBasicDetailsDTO);
        }
        return personDTOs;
    }

    @Override
    public PersonFullDetailsDTO getFullDetails(int id) {

        PersonList person = contactDao.findById(id).orElseThrow(() -> new RuntimeException("Person with id " + id + " not found"));;
        PersonFullDetailsDTO personFullDetailsDTO = new PersonFullDetailsDTO();

        personFullDetailsDTO.setName(person.getPersonName());

        List<ContactDetails> contactsOfAPerson = contactDetailsDao.findByColumnName(id);

        List<PhoneNumberWithType> phoneNumberWithTypes = new ArrayList<>();

        for(ContactDetails contact: contactsOfAPerson){
            PhoneNumberWithType phoneNumberWithType = new PhoneNumberWithType(contact.getPhoneNumber(), contact.getPhoneType());
            phoneNumberWithTypes.add(phoneNumberWithType);
        }

        personFullDetailsDTO.setPhoneDetails(phoneNumberWithTypes);

        ContactDetails contact = contactDetailsDao.getBasicDetails(person.getPersonId());
        personFullDetailsDTO.setEmail(contact.getEmail());

        return personFullDetailsDTO;
    }
}
