package com.m.roman.oreh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "article", schema = "oreh")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "subtitle", length = 100)
    private String subtitle;

    @Lob
    @Column(name = "text")
    private String text;

    @Lob
    @Column(name = "text_line_2")
    private String textLine2;

    @Lob
    @Column(name = "text_line_3")
    private String textLine3;

}