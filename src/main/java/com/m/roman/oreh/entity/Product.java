package com.m.roman.oreh.entity;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.EAGER)
    private List<Media> mediaList;

    public enum ProductType {
        CLASSIC("Орех классический"),
        SWEET("Орех сладкий"),
        SALTY("Орех солёный");
        private final String value;
        ProductType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }

    public enum Weight {
        VALUE1("40г"),
        VALUE2("30г");
        private final String value;
        Weight(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public enum PackageType {
        бумажная,
        пластиковая;
    }
}