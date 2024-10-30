import java.util.*;

public class Averageofno {
    public static void main(String[] args) {
        // Average of three no
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter firstno");
        int num1 = sc.nextInt();
        System.out.println("ENter Secondno");
        int num2 = sc.nextInt();
        System.out.println("ENter Thirdno");
        int num3 = sc.nextInt();
        float Average = num1 + num2 + num3 / 3;
        System.err.println(Average);
    }
}