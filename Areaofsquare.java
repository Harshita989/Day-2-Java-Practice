package Basics.Day2;

import java.util.Scanner;

public class Areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int side = sc.nextInt();
        int Area = side * side;
        System.out.println(Area);
    }
}
