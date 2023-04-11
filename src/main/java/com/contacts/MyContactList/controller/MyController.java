package com.contacts.MyContactList.controller;

import com.contacts.MyContactList.dto.PersonBasicDetailsDTO;
import com.contacts.MyContactList.dto.PersonFullDetailsDTO;
import com.contacts.MyContactList.entity.CombinedData;
import com.contacts.MyContactList.entity.ContactDetails;
import com.contacts.MyContactList.entity.PersonList;
import com.contacts.MyContactList.service.ContactDetailsService;
import com.contacts.MyContactList.service.GettingDataService;
import com.contacts.MyContactList.service.PersonNameService;
import com.contacts.MyContactList.service.SavingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
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
    @Autowired
    SavingDataService savingDataService;
    @Autowired
    GettingDataService getBasicPersonalDetails;

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


    // getting person contact list with his name
//    @GetMapping("/person/basicDetails")
//    public List<ContactDetails>getPersonFullInformation(){
//        return contactDetailsService.getBasicPersonalDetails();
//    }


    // getting all contacts
    @GetMapping("/contacts")
    public List<ContactDetails> getAllContacts(){
        return contactDetailsService.getAllContacts();
    }

    // getting all contacts of a particular person Id
    @GetMapping("/contacts/{personId}")
    public List<ContactDetails> getContactsOfPerson(@PathVariable int personId){
        return contactDetailsService.getContactsOfPerson(personId);
    }


    @PostMapping(path = "/addContact", consumes = "application/json")
    public String addPersonDetails(@RequestBody CombinedData combinedData) {

        this.savingDataService.saveData(combinedData);

        return "Adding Complete";
    }


    @GetMapping("/person/basicDetails")
    public List<PersonBasicDetailsDTO> gettingBasicDetails(){
        return getBasicPersonalDetails.getBasicDetails();
    }
    @GetMapping("person/fullDetails/{personId}")
    public PersonFullDetailsDTO gettingFullDetails(@PathVariable int personId){
        return getBasicPersonalDetails.getFullDetails(personId);
    }

    @PutMapping("/editContact/{pId}")
    public String editPersonDetails(@RequestBody CombinedData combinedData, @PathVariable int pId){
        this.savingDataService.editData(combinedData, pId);
        return "Editing Successful";
    }

}
