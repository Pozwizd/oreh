package com.m.roman.oreh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "news", schema = "oreh")
public class News {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "text_line_2")
    private String textLine2;

}