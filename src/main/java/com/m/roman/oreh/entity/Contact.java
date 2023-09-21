package com.m.roman.oreh.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "phone_number1")
    private String phoneNumber1;

    @Column(name = "phone_number2")
    private String phoneNumber2;

    @Column(name = "email")
    private String email;

    @Column(name = "address_title")
    private String addressTitle;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "production_title")
    private String productionTitle;

    @Column(name = "production_line1")
    private String productionLine1;

    @Column(name = "production_line2")
    private String productionLine2;

    @Column(name = "map_image")
    private String mapImage;

    @Column(name = "pointer_map")
    private String pointerMap;

    public Contact() {
    }

    public Contact(String phoneNumber1, String phoneNumber2, String email, String addressTitle, String addressLine1, String addressLine2, String productionTitle, String productionLine1, String productionLine2, String mapImage, String pointerMap) {
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.email = email;
        this.addressTitle = addressTitle;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.productionTitle = productionTitle;
        this.productionLine1 = productionLine1;
        this.productionLine2 = productionLine2;
        this.mapImage = mapImage;
        this.pointerMap = pointerMap;
    }

    public Contact(int id, String phoneNumber1, String phoneNumber2, String email, String addressTitle, String addressLine1, String addressLine2, String productionTitle, String productionLine1, String productionLine2, String mapImage, String pointerMap) {
        this.id = id;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.email = email;
        this.addressTitle = addressTitle;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.productionTitle = productionTitle;
        this.productionLine1 = productionLine1;
        this.productionLine2 = productionLine2;
        this.mapImage = mapImage;
        this.pointerMap = pointerMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getProductionTitle() {
        return productionTitle;
    }

    public void setProductionTitle(String productionTitle) {
        this.productionTitle = productionTitle;
    }

    public String getProductionLine1() {
        return productionLine1;
    }

    public void setProductionLine1(String productionLine1) {
        this.productionLine1 = productionLine1;
    }

    public String getProductionLine2() {
        return productionLine2;
    }

    public void setProductionLine2(String productionLine2) {
        this.productionLine2 = productionLine2;
    }

    public String getMapImage() {
        return mapImage;
    }

    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    public String getPointerMap() {
        return pointerMap;
    }

    public void setPointerMap(String pointerMap) {
        this.pointerMap = pointerMap;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", phoneNumber1='" + phoneNumber1 + '\'' +
                ", phoneNumber2='" + phoneNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", addressTitle='" + addressTitle + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", productionTitle='" + productionTitle + '\'' +
                ", productionLine1='" + productionLine1 + '\'' +
                ", productionLine2='" + productionLine2 + '\'' +
                ", mapImage='" + mapImage + '\'' +
                ", pointerMap='" + pointerMap + '\'' +
                '}';
    }
}
