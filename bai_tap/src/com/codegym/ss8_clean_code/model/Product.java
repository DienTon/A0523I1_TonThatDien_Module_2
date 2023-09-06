package com.codegym.ss8_clean_code.model;

import java.sql.Array;
import java.util.Scanner;

public class Product {
    private String id, name, productDescription;
    private int price;

    public Product() {
    }

    public Product(String id, String name, String productDescription, int price) {
        this.id = id;
        this.name = name;
        this.productDescription = productDescription;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", productDescription='" + productDescription + '\'' +
                        ", price=" + price;
    }



    public static void main(String[] args) {


//        product.displayProduct(a);
//        product.addProduct(a);
////        product.removeProduct("001",a);
////        product.updateProduct("001", a);
//        product.searchProduct("xe may", a);
    }

}
