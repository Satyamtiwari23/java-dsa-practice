package Operator;
import java.util.Scanner;

public class Arithmetic {

    // Binary Operators
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    // Unary Operators
    public static void increment(int a) {
        System.out.println("Post-increment: " + (a++));
        System.out.println("After post-increment: " + a);

        System.out.println("Pre-increment: " + (++a));
    }

    public static void decrement(int a) {
        System.out.println("Post-decrement: " + (a--));
        System.out.println("After post-decrement: " + a);

        System.out.println("Pre-decrement: " + (--a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // Binary operations
        System.out.println("\n--- Binary Operators ---");
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Modulus: " + modulus(x, y));

        // Unary operations
        System.out.println("\n--- Unary Operators ---");
        increment(x);
        decrement(x);
    }
}