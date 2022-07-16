package com.es.bookshop.dao.impl;

import com.es.bookshop.dao.ProductDAO;
import com.es.bookshop.dao.item.ProductStorageItem;
import com.es.bookshop.demodata.ProductStorage;
import com.es.bookshop.exception.EmptyStorageException;
import com.es.bookshop.exception.ProductNotFoundException;
import com.es.bookshop.product.Product;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class ProductStorageDAO implements ProductDAO {
    private final ProductStorage storageProducts;
    private final ReadWriteLock locker;

    private ProductStorageDAO() {
        storageProducts = new ProductStorage();
        this.locker = new ReentrantReadWriteLock();
    }

    private static final class DAOHolder {
        private static final ProductDAO INSTANCE = new ProductStorageDAO();
    }

    public static ProductDAO getInstance() {
        return DAOHolder.INSTANCE;
    }

    @Override
    public List<Product> getAll() throws EmptyStorageException {
        getLocker().readLock().lock();
        try {
            if (storageProducts.isEmpty()) {
                throw new EmptyStorageException("Storage is empty.");
            } else {
                return storageProducts;
            }
        } finally {
            getLocker().readLock().unlock();
        }
    }

    @Override
    public Product get(Long id) throws ProductNotFoundException {
        return storageProducts.stream()
                .filter(x -> (id.equals(x.getId())))
                .findAny()
                .orElseThrow(() -> new ProductNotFoundException("Product with id " + id + " not found.", id));
    }

    @Override
    public void save(Product product) throws ProductNotFoundException {

    }

    @Override
    public void delete(Long id) throws ProductNotFoundException {

    }

    public ReadWriteLock getLocker() {
        return locker;
    }
}
