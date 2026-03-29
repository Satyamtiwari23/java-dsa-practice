import java.util.Scanner;

public class sb_setinsertdeletechar {

    // Function to set character
    public static void setCharacter(StringBuilder sb, int index, char ch) {
        sb.setCharAt(index, ch);
        System.out.println("After setCharAt: " + sb);
    }

    // Function to insert character/string
    public static void insertValue(StringBuilder sb, int index, String value) {
        sb.insert(index, value);
        System.out.println("After insert: " + sb);
    }

    // Function to delete characters
    public static void deleteValue(StringBuilder sb, int start, int end) {
        sb.delete(start, end);
        System.out.println("After delete: " + sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        // setCharAt
        System.out.println("Enter index to set character: ");
        int index = sc.nextInt();
        System.out.println("Enter character to set: ");
        char ch = sc.next().charAt(0);
        setCharacter(sb, index, ch);

        // insert
        System.out.println("Enter index to insert: ");
        int insertIndex = sc.nextInt();
        System.out.println("Enter string to insert: ");
        String value = sc.next();
        insertValue(sb, insertIndex, value);

        // delete
        System.out.println("Enter start index to delete: ");
        int start = sc.nextInt();
        System.out.println("Enter end index to delete: ");
        int end = sc.nextInt();
        deleteValue(sb, start, end);
        sc.close();
    }
}