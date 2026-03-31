import java.util.Scanner;

public class StringConcat {

    // Function to concatenate strings
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result = concatenate(s1, s2);

        System.out.println("Concatenated String: " + result);
        sc.close();
    }
}