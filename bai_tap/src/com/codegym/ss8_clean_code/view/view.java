package com.codegym.ss8_clean_code.view;

import com.codegym.ss8_clean_code.controller.ProductController;
import com.codegym.ss8_clean_code.model.Product;
import com.codegym.ss8_clean_code.repository.ProductRepository;

public class view {
    public static void main(String[] args) {
        ProductController.displayMenu();
    }
}
