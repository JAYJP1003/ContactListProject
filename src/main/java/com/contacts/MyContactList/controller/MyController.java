package com.contacts.MyContactList.controller;

import com.contacts.MyContactList.entity.ContactDetails;
import com.contacts.MyContactList.entity.PersonList;
import com.contacts.MyContactList.service.ContactDetailsService;
import com.contacts.MyContactList.service.PersonNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

//    private PersonNameService personNameService = new PersonNameServiceImpl();
//    We can do like above code, or we can do this

    //    public MyController(PersonNameService personNameService) {
//        this.personNameService = personNameService;
//    }
    @Autowired
    PersonNameService personNameService;
    @Autowired
    ContactDetailsService contactDetailsService;

    @GetMapping("/home")
    public String home() {
        return "abc";
    }

    // Getting the Person Names in contact
    @GetMapping("/person")
    public List<PersonList> getPersonList() {

        return this.personNameService.getPersonList();

    }

    // Getting Particular person from PersonList
    @GetMapping("/person/{personId}")
    public PersonList getPersonName(@PathVariable String personId) {

        return this.personNameService.getPersonName(Integer.parseInt(personId));
    }

    //Adding person in person List
    @PostMapping(path = "/person", consumes = "application/json")
    public PersonList addPerson(@RequestBody PersonList personList) {

        return this.personNameService.addPersonName(personList);
    }

    @PutMapping("/person/{personId}")
    public PersonList updatePerson(@RequestBody PersonList personList, @PathVariable int personId) {
        return this.personNameService.updatePersonName(personList, personId);
    }
    @DeleteMapping("/person/{personId}")
    public String deletePerson(@PathVariable int personId){
        this.personNameService.deletePersonName(personId);
        return "d0ne";
    }



    // getting all contacts
    @GetMapping("/contacts")
    public List<ContactDetails> getAllContacts(){
        return contactDetailsService.getAllContacts();
    }






}
