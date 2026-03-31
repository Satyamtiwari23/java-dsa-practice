import java.util.Scanner;
public class selectionSort{
    static  Scanner sc = new Scanner(System.in);
    public static int[] createArray(int n){
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] selection_sort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            int min_index = i;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // swap arr[i] and arr[min_index]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
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
        arr = selection_sort(arr);
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}