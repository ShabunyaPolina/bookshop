package com.es.bookshop.dao;

import com.es.bookshop.exception.EmptyStorageException;
import com.es.bookshop.exception.ProductNotFoundException;
import com.es.bookshop.product.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAll() throws EmptyStorageException;
    Product get(Long id) throws ProductNotFoundException;
    void save(Product product) throws ProductNotFoundException;
    void delete(Long id) throws ProductNotFoundException;
}
