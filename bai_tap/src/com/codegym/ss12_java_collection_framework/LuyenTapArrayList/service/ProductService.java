package com.codegym.ss12_java_collection_framework.LuyenTapArrayList.service;

import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.model.Product;
import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.repository.ProductRepository;

import java.util.Scanner;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    public void displayProduct() {
        productRepository.displayProduct();
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" id product: ");
        String id = scanner.nextLine();
        System.out.print(" name product: ");
        String name = scanner.nextLine();
        System.out.print(" price product: ");
        int price = scanner.nextInt();
        Product product = new Product(id, name, price);
        productRepository.addProduct(product);
    }

    public void removeProduct() {
        System.out.print("Nhap id product can xoa: ");
        String idRemove = sc.nextLine();
        productRepository.removeProduct(idRemove);
    }

    public void updateProduct() {
        System.out.print("Nhap id product muon sua: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten moi: ");
        String name = sc.nextLine();
        System.out.print("Nhap gia moi: ");
        int price = sc.nextInt();
        Product product = new Product(id, name, price);
        productRepository.updateProduct(product);
    }

    public void searchProduct() {
        System.out.println("Nhap ten san pham can tim: ");
        String name = sc.nextLine();
        productRepository.searchProduct(name);
    }

    public void sortProductUp() {
        productRepository.sortProductUp();
    }

    public void sortProductDown() {
        productRepository.sortProductDown();
    }
}
