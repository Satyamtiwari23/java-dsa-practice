//count positive , negative and zero using function
package function;
import java.util.Scanner;
public class countNumbers {
    public static void checkNumber(int arr[] , int index){
        int pnum = 0 , nnum = 0 , znum = 0;
        for(int i = 0 ; i < index ; i++){
            if(arr[i] > 0){
                pnum++;
            } else if(arr[i] < 0){
                nnum++;
            } else {
                znum++;
            }
        }
        System.out.println("Positive numbers: " + pnum);
        System.out.println(" Negative numbers: " + nnum);
        System.out.println(" Zeroes: " + znum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int[] arr = new int[100]; // Initialize array with a fixed size
        int index = 0; // To keep track of the current index
        do {
            System.out.print("Enter a number: ");
            if (index < arr.length) {
                arr[index] = sc.nextInt(); // Assign value to the current index
                index++;
            } else {
                System.out.println("Array is full, cannot add more numbers.");
                break;
            }
            System.out.print("To add another press one otherwise press 0: ");
            choice = sc.nextInt();
        } while(choice != 0);
        
            checkNumber(arr , index);
        sc.close();
    }
}