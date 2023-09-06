package com.codegym.ss8_clean_code.service;

import com.codegym.ss8_clean_code.model.Product;
import com.codegym.ss8_clean_code.repository.IProductRepository;
import com.codegym.ss8_clean_code.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);
    String id, name, productDescription;
    int price;

    @Override
    public void add() {
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
        System.out.print("Nhap id sp can xoa: ");
        id = sc.nextLine();
        productRepository.removeProduct(id);
    }

    @Override
    public void updateById() {
        System.out.println("----------UPDATE----------");
        System.out.print("Nhap id can update: "); id = sc.nextLine();
        productRepository.updateProduct(id);
        display();
    }

    @Override
    public void search() {
        System.out.print("Nhap ten sp can tim: ");
        name = sc.nextLine();
        productRepository.searchProduct(name);
    }
}
