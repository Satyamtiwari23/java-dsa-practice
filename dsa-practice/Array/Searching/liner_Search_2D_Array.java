//linear search in 2D array 
import java.util.Scanner;
public class liner_Search_2D_Array {
    public static void search(int arr[][] , int rows , int cols , int num){
        int rs = -1 ,cls = -1 , found = -1;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(arr[i][j] == num){
                    rs = i+1;
                    cls = j+1;
                    found = 1;
                    break;
                }
            }
        }
        if(found == 1){
            System.out.println("Number found at position: (" + rs + "," + cls + ")");
        } else {
            System.out.println("Number not found in the array");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of array: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        // Input
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        // Output
        System.out.println("Array elements are: ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter number to be searched: ");
        num = sc.nextInt();
        search(arr , rows , cols , num);
        sc.close();
    }
}