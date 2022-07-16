package com.es.bookshop.product.book;

import com.es.bookshop.product.Price;
import com.es.bookshop.product.Product;

public class Book extends Product {
    private String name;
    private String author;
    private String language;
    private String publishingHouse;
    private String description;
    private int numberOfPages;

    public Book(String code, Price price, String name, String author, String language,
                String publishingHouse, int numberOfPages, String description, String imageUrl) {
        super(code, price, imageUrl);
        this.name = name;
        this.author = author;
        this.language = language;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.description = description;
    }

    public Book(Long id, String code, Price price, String name, String author, String language,
                String publishingHouse, int numberOfPages, String description, String imageUrl) {
        super(id, code, price, imageUrl);
        this.name = name;
        this.author = author;
        this.language = language;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
