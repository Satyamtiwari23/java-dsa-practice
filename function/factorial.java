// Factorial of a number
package function;
import java.util.Scanner;
public class factorial {
    public static int fact(int fnum ){
        int factorial = 1;
        for(int i = 2 ; i <= fnum ; i++){
            factorial = factorial * i;
        }
        return factorial;
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
