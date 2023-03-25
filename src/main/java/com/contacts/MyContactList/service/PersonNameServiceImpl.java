package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dao.ContactDao;
import com.contacts.MyContactList.entity.PersonList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonNameServiceImpl implements PersonNameService {

    //    List<PersonName> list = new ArrayList<>();
    @Autowired
    private ContactDao contactDao;

    public PersonNameServiceImpl() {
//         list.add(new PersonName(1, "Jay"));
//         list.add(new PersonName(2, "Vaibhav"));
//         list.add(new PersonName(3, "Poonam"));
    }

    @Override
    public List<PersonList> getPersonList() {

        return contactDao.findAll();
//        return null;
    }

    @Override
    public PersonList getPersonName(int personId) {

//         PersonName person = null;
//         for(PersonName p: list)
//         {
//             if(p.getPersonId()== personId){
//                 person = p;
//             }
//         }
//        return contactDao.getOne(personId);
        return  null;
    }

    @Override
    public PersonList addPersonName(PersonList personList) {
//         list.add(personName);
        return  null;    }

    @Override
    public PersonList updatePersonName(PersonList p) {

//       for (PersonName p1 : list){
//            if(p1.getPersonId() == p.getPersonId()){
//                p1.setPersonName(p.getPersonName());
//            }
//        }
//        contactDao.save(p);
        return p;
    }

    public void deletePersonName(int parseInt) {
//        PersonList entity = contactDao.getOne(parseInt);
//        contactDao.delete(entity);
    }
}
