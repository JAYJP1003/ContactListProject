package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDao;
import com.contacts.MyContactList.entity.PersonList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonNameServiceImpl implements PersonNameService {

        List<PersonList> list = new ArrayList<>();

    @Autowired
    private ContactDao contactDao;

    public PersonNameServiceImpl() {}

    @Override
    public List<PersonList> getPersonList() {

        return contactDao.findAll();
//        return null;
    }

    @Override
    public PersonList getPersonName(int personId) {

//         list = contactDao.findAll();
//         for(PersonList p: list)
//         {
//             if(p.getPersonId()== personId){
//                 person = p;
//             }
//         }
        return contactDao.findById(personId).get();

    }

    @Override
    public PersonList addPersonName(PersonList personList) {
//         list.add(personName);
         contactDao.save(personList);
         return personList;
    }

    @Override
    public PersonList updatePersonName(PersonList p, int pId) {

        list = getPersonList();
       for (PersonList p1 : list){
            if(p1.getPersonId() == pId){
                p1.setPersonId(pId);
                p1.setPersonName(p.getPersonName());
                contactDao.save(p1);
                break;
            }
        }

        return p;
    }

    public void deletePersonName(int parseInt) {
//        PersonList entity = contactDao.getOne(parseInt);
        contactDao.deleteById(parseInt);

    }

    @Override
    public List<PersonList> getFullPersonalDetails() {
        return contactDao.getFullPersonalDetails();
    }

}
