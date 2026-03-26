// Print the multiplication table of a number using while loop
package loops;
import java.util.Scanner;
public class forLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}