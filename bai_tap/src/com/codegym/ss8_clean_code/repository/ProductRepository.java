package com.codegym.ss8_clean_code.repository;

import com.codegym.ss8_clean_code.model.Product;

import java.util.Scanner;

public class ProductRepository implements IProductRepository{
    Product[] products = new Product[100];


    //hiển thị sản phẩm
    public void displayProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
                System.out.println(products[i]);
            }
        }
    }

    //thêm sản phẩm
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                products[i] = product;
                break;
            }
        }
    }

    //xóa sản phẩm
    public void removeProduct(String id) {
        System.out.println("------------------REMOVE-----------------");
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
            }
        }
        displayProduct();
    }

    //update sản phẩm
    public void updateProduct(String idS) {
        Scanner sc = new Scanner(System.in);
        String id, name, productDescription;
        int price;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == idS){
                System.out.print("Nhập id: ");
                id = sc.nextLine();
                System.out.print("\nNhập name: ");
                name = sc.nextLine();
                System.out.print("\nNhập mô tả sp: ");
                productDescription = sc.nextLine();
                System.out.print("\nNhập giá: ");
                price = sc.nextInt();
                Product newProduct = new Product(id, name, productDescription, price);
                products[i] = newProduct;
                break;
            }if (i == products.length-1){
                System.out.println("sp ko ton tai");
            }
        }
    }

    //tìm sp
    public void searchProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName() == name) {
                System.out.println("sp can tim la: " + products[i]);
                break;
            }
            if (i == products.length - 1) {
                System.out.println("sp không tồn tại");
            }
        }
    }
}
