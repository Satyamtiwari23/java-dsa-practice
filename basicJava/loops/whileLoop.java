// Print multiplication table of a number using while loop
package loops;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        sc.close();
    }
}
