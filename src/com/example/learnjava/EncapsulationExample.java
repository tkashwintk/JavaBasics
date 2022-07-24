package com.example.learnjava;

public class EncapsulationExample {

    public static void main(String[] args) {

        // Preferred
        ProductWithEncapsulation productA = new ProductWithEncapsulation();
        productA.incrementCount();
        productA.incrementCountByFive();
        System.out.println(productA.getCount());

        // Bad Practice
        Product productB = new Product();
        productB.count += 1;
        productB.count += 5;
        System.out.println(productB.count);
    }
}

class ProductWithEncapsulation {
    private String name;
    private int count;

    public void incrementCount() {
        count +=1;
    }
    public void incrementCountByFive() {
        count += 5;
    }
    public int getCount() {
        return count;
    }
}

class Product {
    String name;
    int count;

}
