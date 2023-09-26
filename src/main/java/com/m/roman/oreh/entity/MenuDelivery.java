package com.m.roman.oreh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "menu_delivery", schema = "oreh")
public class MenuDelivery {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category")
    private String category;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "text")
    private String text;

    @Column(name = "subtitle_2")
    private String subtitle2;

    @Column(name = "text_2")
    private String text2;

    @Column(name = "subtitle_3")
    private String subtitle3;

    @Column(name = "text_3")
    private String text3;

}