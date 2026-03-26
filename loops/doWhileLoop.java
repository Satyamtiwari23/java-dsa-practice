// Print the multiplication table of a number using do while loop
package loops;
import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }while(i <= 10);
        sc.close();
    }
}