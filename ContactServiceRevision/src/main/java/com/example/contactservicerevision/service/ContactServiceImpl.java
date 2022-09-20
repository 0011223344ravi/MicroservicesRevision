package com.example.contactservicerevision.service;

import com.example.contactservicerevision.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact>  getAllUsersContact( ){
        List<Contact> list  = new ArrayList<>();
        list.add(new Contact(1L,"Ravi@gmail.com","Ravi",1311L));
        list.add( new Contact(2L,"baba@gmail.com","baba",1312L));
        return list;
    }

        @Override
        public List<Contact> getContactsOfUser(Long userId) {
            return getAllUsersContact().stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
        }
    }

