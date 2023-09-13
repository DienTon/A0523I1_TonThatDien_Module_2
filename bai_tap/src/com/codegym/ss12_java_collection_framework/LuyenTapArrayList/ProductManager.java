package com.codegym.ss12_java_collection_framework.LuyenTapArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager extends Product{
    ArrayList<Product> products = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void displayProduct(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
    public void addProduct(){
        Scanner scanner =new Scanner(System.in);
        System.out.print(" id product: "); String id = scanner.nextLine();
        System.out.print(" name product: "); String name = scanner.nextLine();
        System.out.print(" price product: "); int price = scanner.nextInt();
        Product product = new Product(id,name,price);
            products.add(product);
        this.displayProduct();
    }
    public void removeProduct(){
        System.out.print("Nhap id product can xoa: ");
        String idRemove = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i)).getId().equals(idRemove)){
                products.remove(i);
            }
        }
        this.displayProduct();
    }

    public void updateProduct(){
        System.out.print("Nhap id product muon sua: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten moi: "); String name = sc.nextLine();
        System.out.print("Nhap gia moi: "); int price = sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i)).getId().equals(id)){
                products.set(i, new Product(id,name,price));
            }
        }
        displayProduct();
    }


    public void searchProduct(){
        System.out.println("Nhap ten san pham can tim: ");
        String name = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if((products.get(i)).getName().contains(name)){
                System.out.println(products.get(i));
            }
        }
    }

    public void sortProductUp(){
        System.out.println("=====sap xep=====");
        for (int i = 1; i < products.size(); i++) {
            if ((products.get(i)).getPrice() < (products.get(i-1)).getPrice()){
                Product temp = products.get(i);
                products.set(i, products.get(i-1));
                products.set(i-1, temp);
            }
        }
        displayProduct();
    }
    public void sortProductDown(){
        System.out.println("=====sap xep giam dan=====");
        for (int i = 0; i < products.size()-1; i++) {
            if ((products.get(i)).getPrice() > (products.get(i+1)).getPrice()){
                Product temp = products.get(i);
                products.set(i, products.get(i+1));
                products.set(i+1, temp);
            }
        }
        displayProduct();
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("001","sting",10000);
        Product product2 = new Product("002","sua milo",7000);
        Product product3 = new Product("003","bia",12000);
        productManager.products.add(product1);
        productManager.products.add(product2);
        productManager.products.add(product3);
        productManager.displayProduct();
//        productManager.removeProduct();
//        productManager.updateProduct();
//        productManager.searchProduct();
//        productManager.sortProductUp();
        productManager.sortProductDown();
    }
}
