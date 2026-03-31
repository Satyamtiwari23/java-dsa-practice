package bitManipulation;
import java.util.Scanner;

public class SetBit{

    // Function to set bit
    public static int setBit(int number, int position) {
        int bitMask = 1 << position;
        return number | bitMask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        int result = setBit(number, position);

        System.out.println("Number after setting bit: " + result);

        sc.close();
    }
}