package Basics.Day2;

import java.util.Scanner;

public class Sumusinginput {
    public static void main(String[] args) {
        // Sum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second no:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
