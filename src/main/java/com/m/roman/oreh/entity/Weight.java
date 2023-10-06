package com.m.roman.oreh.entity;

import lombok.Getter;

@Getter
public enum Weight {
    VALUE1("40г"),
    VALUE2("30г");
    private final String value;
    Weight(String value) {
        this.value = value;
    }
}