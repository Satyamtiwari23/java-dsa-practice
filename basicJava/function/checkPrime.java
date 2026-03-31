// This program checks if a number is prime or not using a function.
package function;
import java.util.Scanner;
public class checkPrime {
    public static int checkNumber(int n){
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count > 2){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        checkNumber(n);
        int result = checkNumber(n);
        if(result == 1){
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
        sc.close();
    }
}