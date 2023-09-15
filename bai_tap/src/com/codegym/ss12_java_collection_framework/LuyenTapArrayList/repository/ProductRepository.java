package com.codegym.ss12_java_collection_framework.LuyenTapArrayList.repository;

import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository extends Product {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product("001", "sting", 10000));
        products.add(new Product("002", "stong", 60000));
        products.add(new Product("003", "steng", 30000));
    }

    Scanner sc = new Scanner(System.in);

    public void displayProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        this.displayProduct();
    }

    public void removeProduct(String idRemove) {
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i)).getId().equals(idRemove)) {
                products.remove(i);
            }
        }
        this.displayProduct();
    }

    public void updateProduct(Product product) {
        String id = product.getId();
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i)).getId().equals(id)) {
                products.set(i, product);
            }
        }
        displayProduct();
    }


    public void searchProduct(String name) {

        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i)).getName().contains(name)) {
                System.out.println(products.get(i));
            }
        }
    }

    public void sortProductUp() {
        System.out.println("=====sap xep=====");
        for (int i = 1; i < products.size(); i++) {
            if ((products.get(i)).getPrice() < (products.get(i - 1)).getPrice()) {
                Product temp = products.get(i);
                products.set(i, products.get(i - 1));
                products.set(i - 1, temp);
            }
        }
        displayProduct();
    }

    public void sortProductDown() {
        System.out.println("=====sap xep giam dan=====");
        for (int i = 0; i < products.size() - 1; i++) {
            if ((products.get(i)).getPrice() < (products.get(i + 1)).getPrice()) {
                Product temp = products.get(i);
                products.set(i, products.get(i + 1));
                products.set(i + 1, temp);
            }
        }
        displayProduct();
    }
}
