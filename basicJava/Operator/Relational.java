package Operator;
import java.util.Scanner;

public class Relational{

    // Equal to
    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    // Not equal
    public static boolean isNotEqual(int a, int b) {
        return a != b;
    }

    // Greater than
    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    // Less than
    public static boolean isLess(int a, int b) {
        return a < b;
    }

    // Greater than or equal
    public static boolean isGreaterEqual(int a, int b) {
        return a >= b;
    }

    // Less than or equal
    public static boolean isLessEqual(int a, int b) {
        return a <= b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("\n--- Relational Operators ---");
        System.out.println("Equal (==): " + isEqual(x, y));
        System.out.println("Not Equal (!=): " + isNotEqual(x, y));
        System.out.println("Greater (>): " + isGreater(x, y));
        System.out.println("Less (<): " + isLess(x, y));
        System.out.println("Greater or Equal (>=): " + isGreaterEqual(x, y));
        System.out.println("Less or Equal (<=): " + isLessEqual(x, y));
        sc.close();
    }
}