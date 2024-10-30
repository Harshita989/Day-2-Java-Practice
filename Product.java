package Basics.Day2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        // Product of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second no:");
        int num2 = sc.nextInt();
        int Product = num1 * num2;
        System.out.println(Product);
    }
}
