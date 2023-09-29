package com.m.roman.oreh.repository;

import com.m.roman.oreh.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}