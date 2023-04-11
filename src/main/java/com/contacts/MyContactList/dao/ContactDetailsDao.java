package com.contacts.MyContactList.dao;

import com.contacts.MyContactList.entity.ContactDetails;
import com.contacts.MyContactList.entity.ContactId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDetailsDao extends JpaRepository<ContactDetails, ContactId> {

        @Query(value = "Select c FROM ContactDetails c  WHERE c.personId = :columnValue")
        List<ContactDetails> findByColumnName(@Param("columnValue") int columnValue);

//        @Query(value = "Select c, p.personName FROM ContactDetails c JOIN PersonList p ON c.personId = p.personId WHERE c.phoneType = 'personal'")
        @Query(value = "Select c FROM ContactDetails c  WHERE c.phoneType = 'personal' AND personId = :id")
        ContactDetails getBasicDetails(@Param("id") int id);

        @Query("DELETE FROM ContactDetails c WHERE c.personId = :pId")
        void deleteAllByPersonId(@Param("pId") int pId);

}
