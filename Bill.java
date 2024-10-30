package Basics.Day2;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        float num1 = sc.nextFloat();

        System.out.println("Enter Second no:");
        float num2 = sc.nextFloat();

        System.out.println("Enter third no.");
        float num3 = sc.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.println("Bill" + (sum + (sum * 0.18)));
        int $ = 12; /*
                     * This line will not give any error bcz Names ofvariables are called identifier
                     * in Java.Identifierrulesays,identifierscanstartwithany alphabet or underscore
                     * (“_”) or dollar (“$”).According to the rule the given variable name is a
                     * valid identifier.
                     */
        System.out.println($);

    }
}
