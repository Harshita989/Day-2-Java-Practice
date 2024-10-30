package Basics.Day2;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // It will print the word before any space
        // System.out.println(name);
        String name2 = sc.nextLine(); // It will print the whole sentence or line
        System.out.println(name2);
        int num1 = sc.nextInt(); // It will print the integer
        System.out.println(num1);
        byte b = sc.nextByte();
        System.out.println(b);
        float f = sc.nextFloat();
        System.out.println(f);
        double d = sc.nextDouble();
        System.out.println(d);
    }
}
