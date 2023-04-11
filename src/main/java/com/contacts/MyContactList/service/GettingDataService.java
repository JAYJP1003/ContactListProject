package com.contacts.MyContactList.service;

import com.contacts.MyContactList.dto.PersonBasicDetailsDTO;
import com.contacts.MyContactList.dto.PersonFullDetailsDTO;

import java.util.List;

public interface GettingDataService {
    public List<PersonBasicDetailsDTO> getBasicDetails();

    public PersonFullDetailsDTO getFullDetails(int id);
}
