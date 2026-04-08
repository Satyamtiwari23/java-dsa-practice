/* Compare adjacent elements and swap them if they are in the wrong order. 
this process sort the largest element to the end of the array in each iteration.
because of this in the second loop we can ignore the last element and so on.(jth loop runs till n-i-1)
This process is repeated until the entire array is sorted.*/
import java.util.Scanner;
public class bubbleSorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] bubbleSort(int arr[]) {
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Sorted array:");
        printArray(arr);
        sc.close();
    }
}