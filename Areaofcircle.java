package Basics.Day2;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius;
        System.out.println(Area);
    }
}
