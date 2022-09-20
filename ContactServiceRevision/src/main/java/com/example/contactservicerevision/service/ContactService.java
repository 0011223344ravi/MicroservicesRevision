package com.example.contactservicerevision.service;

import com.example.contactservicerevision.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
