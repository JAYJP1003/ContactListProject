package com.contacts.MyContactList.dao;

import com.contacts.MyContactList.entity.PersonList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends JpaRepository<PersonList, Integer> {
}
