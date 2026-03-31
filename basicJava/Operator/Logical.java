package Operator;
import java.util.Scanner;

public class Logical {

    // AND operator
    public static boolean andOperation(boolean a, boolean b) {
        return a && b;
    }

    // OR operator
    public static boolean orOperation(boolean a, boolean b) {
        return a || b;
    }

    // NOT operator
    public static boolean notOperation(boolean a) {
        return !a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean (true/false): ");
        boolean x = sc.nextBoolean();

        System.out.print("Enter second boolean (true/false): ");
        boolean y = sc.nextBoolean();

        System.out.println("\n--- Logical Operators ---");
        System.out.println("AND (&&): " + andOperation(x, y));
        System.out.println("OR (||): " + orOperation(x, y));
        System.out.println("NOT (!) of first value: " + notOperation(x));
        System.out.println("NOT (!) of second value: " + notOperation(y));
        sc.close();
    }
}