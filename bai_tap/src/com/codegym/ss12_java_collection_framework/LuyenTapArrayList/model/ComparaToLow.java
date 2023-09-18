package com.codegym.ss12_java_collection_framework.LuyenTapArrayList.model;

import java.util.Comparator;
import java.util.stream.Collector;

public class ComparaToLow implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
