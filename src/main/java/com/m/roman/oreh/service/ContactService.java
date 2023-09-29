package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getAllContacts();

    public Contact getContact(int id);

    public void saveContact(Contact contact);

    public void deleteContact(int id);

    public void updateContact(Contact contact);
}
