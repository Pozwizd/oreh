package com.m.roman.oreh.model;

import lombok.Getter;

@Getter
public enum ProductType {
    CLASSIC("Орех классический"),
    SWEET("Орех сладкий"),
    SALTY("Орех солёный");

    private final String value;
    ProductType(String value) {
        this.value = value;
    }
}
