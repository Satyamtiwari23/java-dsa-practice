import java.util.Scanner;
public class countDistanceOf1and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemets in Array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("In array elements only 0 , 1 and 2 are allowed");
        for(int i = 0 ; i < num ; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if(arr[i] < 0 || arr[i] > 2){
                System.out.println("Invalid input! Please enter only 0, 1, or 2.");
                i--; // Decrement i to repeat the input for the current index
            }
        }
        int num2 = -1 , num1 = -1;
        for(int i = 0 ; i < num ; i++){
            if(arr[i] == 2){
                num2 = i;
            }
            else if(arr[i] == 1){
                num1 = i;
            }
        }
        if(num2 != -1 && num1 != -1){
            int finalnum = num2 - num1;
            System.out.println("The distance between 1 and 2 is: " + Math.abs(finalnum));
        }
        else{
            System.out.println("Either 1 or 2 is not present in the array.");
        }
        sc.close();
    }
    
}