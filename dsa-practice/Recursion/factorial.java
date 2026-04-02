// Factorial of a number using recursion
import java.util.Scanner;
public class factorial {
    public static int fact(int fnum ){
        if(fnum == 0 || fnum == 1){
            return 1;
        } else {
            return fnum * fact(fnum - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = sc.nextInt();
        int result = fact(num1);
        System.out.println("Factorial: " + result);
        sc.close();
    }
}