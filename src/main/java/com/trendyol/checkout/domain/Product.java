package com.trendyol.checkout.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String category;
    private double price;
    private String description;
    private int quantity;
}
