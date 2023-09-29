package com.m.roman.oreh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product", schema = "oreh")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @OneToMany(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH}, mappedBy = "product", fetch = FetchType.EAGER)
    private List<Media> mediaList;

    @Column(name = "special_offer")
    private String specialOffer;

    @Column(name = "title")
    private String title;

    @Column(name = "article_number")
    private String articleNumber;

    @Lob
    @Column(name = "product_type")
    private String productType;

    @Lob
    @Column(name = "weight")
    private String weight;

    @Lob
    @Column(name = "package_type")
    private String packageType;

    @Column(name = "price", precision = 10)
    private BigDecimal price;

    @Column(name = "original_price", precision = 10)
    private BigDecimal originalPrice;

    public void addMedia(Media media) {
        media.setProduct(this);
        mediaList.add(media);
    }


}