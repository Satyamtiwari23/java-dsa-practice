// Fibonacci Series using function
package function;
import java.util.Scanner;
public class fibonacci {
    public static void checkNumber(int n){
        int fnum = 0 ;
        int snum = 1 ;
        int nnum = 0;
        System.out.print("Fibonacci Series: ");
        System.out.print(fnum + " ");
        System.out.print(snum + " ");

        for(int i = 1 ; i <= n ; i++){
            nnum = fnum + snum ;
            fnum = snum ;
            snum = nnum ;
            System.out.print(nnum + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        checkNumber(n);
        sc.close();
    }
}