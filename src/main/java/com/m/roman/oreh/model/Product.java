package com.m.roman.oreh.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product", schema = "oreh")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "special_offer")
    private String specialOffer;

    @Column(name = "title")
    private String title;

    @Column(name = "article_number")
    private String articleNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_type")
    private ProductType productType;

    @Enumerated(EnumType.STRING)
    @Column(name = "weight")
    private Weight weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "package_type")
    private PackageType packageType;

    @Column(name = "price", precision = 10)
    private BigDecimal price;

    @Column(name = "original_price", precision = 10)
    private BigDecimal originalPrice;

    @Column(name = "full_image_url")
    private String fullImageUrl;

    @Column(name = "composition")
    private String composition;

    @Column(name = "energy_value")
    private String energyValue;

    @Column(name = "shelf_life")
    private String shelfLife;

    @Column(name = "storage_conditions")
    private String storageConditions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.EAGER)
    private List<Media> mediaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.EAGER)
    private List<MoreInfo> moreInfoList;

}