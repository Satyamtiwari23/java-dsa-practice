// Sum of two numbers using function
package function;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static int sum(int fnum , int snum){
        return fnum + snum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        int result = sum(num1 , num2);
        System.out.println("Sum: " + result);
        sc.close();
    }
}