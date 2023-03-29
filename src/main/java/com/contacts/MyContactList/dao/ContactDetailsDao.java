package com.contacts.MyContactList.dao;

import com.contacts.MyContactList.entity.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailsDao extends JpaRepository<ContactDetails, Integer> {

}
