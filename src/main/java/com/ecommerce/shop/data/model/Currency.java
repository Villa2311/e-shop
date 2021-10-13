package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"), SRC("Singapore"), GBP("British"), FRC("franc"), GHC("Ghana Cedes");

    private String name;
    Currency(String s){
        this.name = s;
    }

    public String getName(String name) {
        return this.name;
    }
}
