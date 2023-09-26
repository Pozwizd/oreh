package com.m.roman.oreh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product", schema = "oreh")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_url_2")
    private String imageUrl2;

    @Column(name = "image_url_3")
    private String imageUrl3;

    @Column(name = "special_offer")
    private String specialOffer;

    @Column(name = "title")
    private String title;

    @Column(name = "article_number")
    private String articleNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private String weight;

    @Column(name = "package_type")
    private String packageType;

    @Column(name = "price", precision = 10)
    private BigDecimal price;

    @Column(name = "original_price", precision = 10)
    private BigDecimal originalPrice;

}