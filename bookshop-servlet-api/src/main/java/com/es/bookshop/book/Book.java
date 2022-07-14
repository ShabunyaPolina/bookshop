package com.es.bookshop.book;

public class Book {
    private String name;
    private String author;
    private String publishingHouse;
    private String description;
    private String imageUrl;
    private String language;
    private int numberOfPages;
    private int price;

    public Book(String name, String author, String publishingHouse, String description,
                String imageUrl, String language, int numberOfPages, int price) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.description = description;
        this.imageUrl = imageUrl;
        this.language = language;
        this.numberOfPages = numberOfPages;
        this.price = price;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
