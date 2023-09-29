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
@Table(name = "title_text", schema = "oreh")
public class TitleText {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "url")
    private String url;

}