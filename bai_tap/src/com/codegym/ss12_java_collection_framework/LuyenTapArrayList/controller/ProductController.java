package com.codegym.ss12_java_collection_framework.LuyenTapArrayList.controller;


import com.codegym.ss12_java_collection_framework.LuyenTapArrayList.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        ProductService productService = new ProductService();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select function: ");
            System.out.println(
                    " 1. Display all products" +
                            "\n 2. Add product" +
                            "\n 3. Delete product" +
                            "\n 4. Update product" +
                            "\n 5. Search" +
                            "\n 6. Sort function down" +
                            "\n 7. Sort function up" +
                            "\n 8. Exit ");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display function: ");
                    productService.displayProduct();
                    break;
                case 2:
                    System.out.println("Additional function: ");
                    productService.addProduct();
                    break;
                case 3:
                    System.out.println("Remove by id function: ");
                    productService.removeProduct();
                    break;
                case 4:
                    System.out.println("Update function: ");
                    productService.updateProduct();
                    break;
                case 5:
                    System.out.println("Search function: ");
                    productService.searchProduct();
                    break;
                case 6:
                    System.out.println("Sort function down");
                    productService.sortProductDown();
                    break;
                case 7:
                    System.out.println("Sort function up");
                    productService.sortProductUp();
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("Your select is not valid..!");
            }
        } while (choice != 6);
    }


}

