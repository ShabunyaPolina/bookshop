package com.es.bookshop.product;

public class Product {
    private Long id;
    private String code;
    private Price price;
    private String imageUrl;

    public Product(String code, Price price, String imageUrl) {
        this.code = code;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Product(Long id, String code, Price price, String imageUrl) {
        this.id = id;
        this.code = code;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
