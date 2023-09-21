package com.m.roman.oreh.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_url_2")
    private String imageUrl2;

    @Column(name = "image_url_3")
    private String imageUrl3;

    @Column(name = "special_offer")
    private String specialOffer;

    @Column
    private String title;

    @Column(name = "article_number")
    private String articleNumber;


    @Column
    private String description;

    @Column
    private String weight;

    @Column(name = "package_type")
    private String packageType;

    @Column
    private double price;

    @Column(name = "original_price")
    private String originalPrice;

    public Product() {
    }

    public Product(int id, String imageUrl, String imageUrl2, String imageUrl3, String specialOffer, String title, String articleNumber, String description, String weight, String packageType, double price, String originalPrice) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
        this.specialOffer = specialOffer;
        this.title = title;
        this.articleNumber = articleNumber;
        this.description = description;
        this.weight = weight;
        this.packageType = packageType;
        this.price = price;
        this.originalPrice = originalPrice;
    }

    public Product(String imageUrl, String imageUrl2, String imageUrl3, String specialOffer, String title, String articleNumber, String description, String weight, String packageType, double price, String originalPrice) {
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
        this.specialOffer = specialOffer;
        this.title = title;
        this.articleNumber = articleNumber;
        this.description = description;
        this.weight = weight;
        this.packageType = packageType;
        this.price = price;
        this.originalPrice = originalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }

    public String getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(String specialOffer) {
        this.specialOffer = specialOffer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageUrl2='" + imageUrl2 + '\'' +
                ", imageUrl3='" + imageUrl3 + '\'' +
                ", specialOffer='" + specialOffer + '\'' +
                ", title='" + title + '\'' +
                ", articleNumber='" + articleNumber + '\'' +
                ", description='" + description + '\'' +
                ", weight='" + weight + '\'' +
                ", packageType='" + packageType + '\'' +
                ", price=" + price +
                ", originalPrice='" + originalPrice + '\'' +
                '}';
    }
}
