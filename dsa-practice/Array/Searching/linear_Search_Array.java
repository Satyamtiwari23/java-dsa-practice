// linear search in array 
import java.util.Scanner;
public class linear_Search_Array {
    public static int search(int numbers[] , int size , int num){
        int ind = -1;
        for(int i = 0 ; i < size ; i++){
            if(numbers[i] == num){
                ind = i;
            }
        }
        return ind;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // Input
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // Output
        System.out.print("Array elements are: ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter number to be searched: ");
        num = sc.nextInt();
        int result = search(numbers , size , num);
        if(result != -1){
            System.out.println("Number found at index: " + (result+1));
        }else{
            System.out.println("Number not found in the array");
        }
        sc.close();
    }
}
