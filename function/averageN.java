// Average of n numbers using function
package function;
import java.util.Scanner;
public class averageN {
    public static float avg(int num){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();
            sum = sum + n;
        }
        float average = (float) sum / num;
        sc.close();
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Integers for average: ");
        int num = sc.nextInt();
        float result = avg(num);
        System.out.println("Average: " + result);
        sc.close();
    }
}