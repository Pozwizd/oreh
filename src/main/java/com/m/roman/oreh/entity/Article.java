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
@Table(name = "article", schema = "oreh")
public class Article {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

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