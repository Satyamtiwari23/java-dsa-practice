import java.util.Scanner;

public class LengthCharAtCompare {

    // Function 1: Find length
    public static int findLength(String str) {
        return str.length();
    }

    // Function 2: Print all characters
    public static void printChars(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + " : " + str.charAt(i));
        }
    }

    // Function 3: Compare two strings
    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Call length function
        int len = findLength(s1);
        System.out.println("\nLength of first string: " + len);

        // Call charAt function
        System.out.println("\nCharacters of first string:");
        printChars(s1);

        // Call compareTo function
        int result = compareStrings(s1, s2);

        System.out.println("\nComparison result:");
        if(result == 0) {
            System.out.println("Strings are equal");
        } else if(result > 0) {
            System.out.println("First string is greater");
        } else {
            System.out.println("Second string is greater");
        }
        sc.close();
    }
}