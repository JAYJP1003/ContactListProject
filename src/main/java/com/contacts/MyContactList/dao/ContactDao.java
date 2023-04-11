package com.contacts.MyContactList.dao;

import com.contacts.MyContactList.entity.PersonList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao extends JpaRepository<PersonList, Integer> {
    @Query("SELECT p FROM PersonList p")
    List<PersonList> getFullPersonalDetails();


}
