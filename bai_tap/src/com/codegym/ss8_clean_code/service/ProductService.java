package com.codegym.ss8_clean_code.service;

import com.codegym.ss8_clean_code.model.Product;
import com.codegym.ss8_clean_code.repository.IProductRepository;
import com.codegym.ss8_clean_code.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);


    @Override
    public void add() {
        String id, name, productDescription;
        int price;
        System.out.println("-------------thêm sp-------------");
        System.out.print("Nhập id: ");
        id = sc.nextLine();
        System.out.print("\nNhập name: ");
        name = sc.nextLine();
        System.out.print("\nNhập mô tả sp: ");
        productDescription = sc.nextLine();
        System.out.print("\nNhập giá: ");
        price = sc.nextInt();
        Product newProduct = new Product(id, name, productDescription, price);
        productRepository.addProduct(newProduct);
    }

    @Override
    public void display() {
        productRepository.displayProduct();
    }

    @Override
    public void removeById() {
        String id;
        System.out.print("Nhap id sp can xoa: ");
        id = sc.nextLine();
        productRepository.removeProduct(id);
    }

    @Override
    public void updateById() {
        String id;
        System.out.println("----------UPDATE----------");
        System.out.print("Nhap id can update: "); id = sc.nextLine();
        productRepository.updateProduct(id);
        display();
    }

    @Override
    public void search() {
        String name;
        System.out.print("Nhap ten sp can tim: ");
        name = sc.nextLine();
        productRepository.searchProduct(name);
    }
}
