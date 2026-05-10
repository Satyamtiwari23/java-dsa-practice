package Leetcode;
import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int original = x;
        int reversed = 0;
    
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        boolean isPalindrome = original == reversed;
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
