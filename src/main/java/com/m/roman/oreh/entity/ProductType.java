package com.m.roman.oreh.entity;

import lombok.Getter;

@Getter
public enum ProductType {
    CLASSIC("Классический"),
    SWEET("Орех сладкий"),
    SALTY("Орех солёный");

    private final String value;
    ProductType(String value) {
        this.value = value;
    }
}
