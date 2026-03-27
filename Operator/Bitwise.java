package Operator;
import java.util.Scanner;

public class Bitwise {

    // AND
    public static int andOperation(int a, int b) {
        return a & b;
    }

    // OR
    public static int orOperation(int a, int b) {
        return a | b;
    }

    // XOR
    public static int xorOperation(int a, int b) {
        return a ^ b;
    }

    // NOT
    public static int notOperation(int a) {
        return ~a;
    }

    // Left Shift
    public static int leftShift(int a, int n) {
        return a << n;
    }

    // Right Shift
    public static int rightShift(int a, int n) {
        return a >> n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter shift value: ");
        int n = sc.nextInt();

        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("AND (&): " + andOperation(x, y));
        System.out.println("OR (|): " + orOperation(x, y));
        System.out.println("XOR (^): " + xorOperation(x, y));
        System.out.println("NOT (~) of first number: " + notOperation(x));
        System.out.println("Left Shift (<<): " + leftShift(x, n));
        System.out.println("Right Shift (>>): " + rightShift(x, n));
    }
}