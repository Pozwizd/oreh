package com.m.roman.oreh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "phone_number_1")
    private String phoneNumber1;

    @Column(name = "phone_number_2")
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