package com.m.roman.oreh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact", schema = "oreh")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "phone_number1", length = 20)
    private String phoneNumber1;

    @Column(name = "phone_number2", length = 20)
    private String phoneNumber2;

    @Column(name = "link_viber", length = 100)
    private String linkViber;

    @Column(name = "link_telegram", length = 100)
    private String linkTelegram;

    @Column(name = "link_whatsapp", length = 100)
    private String linkWhatsapp;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "address_title", length = 100)
    private String addressTitle;

    @Column(name = "address_line", length = 100)
    private String addressLine;

    @Column(name = "production_title", length = 100)
    private String productionTitle;

    @Column(name = "production_line", length = 100)
    private String productionLine;

    @Column(name = "map_image", length = 100)
    private String mapImage;

    @Column(name = "pointer_map", length = 100)
    private String pointerMap;

}