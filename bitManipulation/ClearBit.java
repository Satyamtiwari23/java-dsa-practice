package bitManipulation;    
import java.util.Scanner;

public class ClearBit{

    // Function to clear bit
    public static int clearBit(int number, int position) {
        int bitMask = 1 << position;
        int notBitMask = ~bitMask;
        return number & notBitMask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        int result = clearBit(number, position);

        System.out.println("Number after clearing bit: " + result);

        sc.close();
    }
}