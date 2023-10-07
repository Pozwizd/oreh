package com.m.roman.oreh.repository;

import com.m.roman.oreh.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}