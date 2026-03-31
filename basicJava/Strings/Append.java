import java.util.Scanner;

public class Append{

    // Function to append string
    public static void appendString(StringBuilder sb, String value) {
        sb.append(value);
        System.out.println("After append: " + sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String input = sc.nextLine();

        System.out.print("Enter string to append: ");
        String add = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        // Call function
        appendString(sb, add);
        sc.close();
    }
}