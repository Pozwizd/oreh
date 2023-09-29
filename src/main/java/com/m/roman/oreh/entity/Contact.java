package com.m.roman.oreh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact", schema = "oreh")
public class Contact {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "phone_number1")
    private String phoneNumber1;

    @Column(name = "phone_number2")
    private String phoneNumber2;

    @Column(name = "link_viber")
    private String linkViber;

    @Column(name = "link_telegram")
    private String linkTelegram;

    @Column(name = "link_whatsapp")
    private String linkWhatsapp;

    @Column(name = "email")
    private String email;

    @Column(name = "address_title")
    private String addressTitle;

    @Column(name = "address_line")
    private String addressLine;

    @Column(name = "production_title")
    private String productionTitle;

    @Column(name = "production_line")
    private String productionLine;

    @Column(name = "map_image")
    private String mapImage;

    @Column(name = "pointer_map")
    private String pointerMap;
}