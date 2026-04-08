/* Selection Sort: Find the minimum element in the unsorted 
array and swap it with the first element. Thus, the smallest 
element is placed at the beginning of the array in each iteration.*/
import java.util.Scanner;
public class selectionSorting{
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]) {
        for(int i = 0 ; i < arr.length -1 ; i++){
            int minIndex = i;
            for(int j = i ; j < arr.length ; j++){
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
        sc.close();
    }
}