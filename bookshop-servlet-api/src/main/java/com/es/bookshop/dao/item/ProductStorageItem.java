package com.es.bookshop.dao.item;

import com.es.bookshop.product.Product;

public class ProductStorageItem {
    private Long id;
    private Product item;

    public ProductStorageItem(Long id, Product item) {
        this.id = id;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }
}
