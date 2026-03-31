import java.util.Scanner;
public class bubbleSort{
    static Scanner sc = new Scanner(System.in);
    public static int[] createArray(int n){
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] bubble_sort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        arr = createArray(n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        arr = bubble_sort(arr);
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}