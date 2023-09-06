package com.codegym.ss8_clean_code.repository;

import com.codegym.ss8_clean_code.model.Product;

public interface IProductRepository {
    void displayProduct();
     void addProduct(Product product);
    void removeProduct(String id);
    void updateProduct(String id);
    void searchProduct(String name);
}
