package bitManipulation;
import java.util.Scanner;

public class UpdateBit{

    // Function to update bit
    public static int updateBit(int number, int position, int operation) {

        int bitMask = 1 << position;

        if (operation == 1) {
            // Set bit
            return number | bitMask;
        } else {
            // Clear bit
            int notBitMask = ~bitMask;
            return number & notBitMask;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        System.out.print("Enter operation (1 = set, 0 = clear): ");
        int operation = sc.nextInt();

        int result = updateBit(number, position, operation);

        System.out.println("Number after update: " + result);

        sc.close();
    }
}