package com.m.roman.oreh.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "text_line_2")
    private String textLine2;

    @Column(name = "text_line_3")
    private String textLine3;

    public Article() {

    }

    public Article(int id, String title, String text, String textLine2, String textLine3) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.textLine2 = textLine2;
        this.textLine3 = textLine3;
    }

    public Article(String title, String text, String textLine2, String textLine3) {
        this.title = title;
        this.text = text;
        this.textLine2 = textLine2;
        this.textLine3 = textLine3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextLine2() {
        return textLine2;
    }

    public void setTextLine2(String textLine2) {
        this.textLine2 = textLine2;
    }

    public String getTextLine3() {
        return textLine3;
    }

    public void setTextLine3(String textLine3) {
        this.textLine3 = textLine3;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", textLine2='" + textLine2 + '\'' +
                ", textLine3='" + textLine3 + '\'' +
                '}';
    }
}
