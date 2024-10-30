package Basics.Day2;

public class Typepromotion {
    public static void main(String[] args) {
        // Java automatically promotes short ,byte,char datatype to int while evaluating
        // expressions
        char c = 'a';
        System.out.println((int) (c));
        int b = 10;
        int sum = c + b;
        System.out.println(sum);

    }
}
