package bitManipulation;
import java.util.Scanner;

public class GetBit{

    // Function to get bit
    public static void getBit(int number, int position) {
        int bitMask = 1 << position;

        if ((number & bitMask) == 0) {
            System.out.println("Bit at position " + position + " is 0");
        } else {
            System.out.println("Bit at position " + position + " is 1");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        getBit(number, position);

        sc.close();
    }
}