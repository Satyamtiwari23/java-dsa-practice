// Calculate Grates Common Divisor (GCD) using function
package function;
import java.util.Scanner;
public class GCD {
    public static int checkNumber(int n, int x){
        int num =1 ;
        for(int i = 1 ; i <= n && i <= x ; i++){
            if(n % i == 0 && x % i == 0){
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int n , x ;
        do {
            System.out.print("Enter N: ");
            n = sc.nextInt();
            System.out.print("Enter X: ");
            x = sc.nextInt();
        } while(choice != 0);
        
        int result = checkNumber(n ,x);
        System.out.println("Result: " + result);
        sc.close();
    }
}