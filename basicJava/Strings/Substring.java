import java.util.Scanner;

public class Substring{

    // Function to get substring
    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String result = getSubstring(input, start, end);

        System.out.println("Substring is: " + result);
        sc.close();
    }
}