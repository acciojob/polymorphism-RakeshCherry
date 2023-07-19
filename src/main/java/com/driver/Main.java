package com.driver;

public class Main {

    public static void main (String[] args) {

        Product p = new Product();

        int two = p.product(10, 20);

        int three = p.product(10,20,30);

        double twoDouble = p.product(10,30);

        System.out.println(two + " " + three + " " + twoDouble);
    }

        public static class Product {

            public int product(int x, int y) {
                return x * y;
            }

            public int product(int x, int y, int z){
                return x*y*z;
            }

            public double product(double x, double y){
                return x*y;
            }
        }

}