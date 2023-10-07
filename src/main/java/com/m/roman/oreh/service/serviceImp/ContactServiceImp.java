package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.model.Contact;
import com.m.roman.oreh.repository.ContactRepository;
import com.m.roman.oreh.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImp implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImp(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContact(long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return contact.orElse(null);
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public void updateContact(Contact contact) {
        contactRepository.save(contact);
    }
}
