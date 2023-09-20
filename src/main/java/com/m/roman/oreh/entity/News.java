package com.m.roman.oreh.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;


@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;

    private String date;

    private String title;

    private String text;

    private String textLine2;

    public News() {
    }

    public News(int id, String url, String date, String title, String text, String textLine2) {
        this.id = id;
        this.url = url;
        this.date = date;
        this.title = title;
        this.text = text;
        this.textLine2 = textLine2;
    }

    public News(String url, String date, String title, String text, String textLine2) {
        this.url = url;
        this.date = date;
        this.title = title;
        this.text = text;
        this.textLine2 = textLine2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", textLine2='" + textLine2 + '\'' +
                '}';
    }
}
