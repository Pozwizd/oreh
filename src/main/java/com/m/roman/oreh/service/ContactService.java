package com.m.roman.oreh.service;

import com.m.roman.oreh.model.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getAllContacts();

    public Contact getContact(long id);

    public void saveContact(Contact contact);

    public void deleteContact(long id);

    public void updateContact(Contact contact);
}
