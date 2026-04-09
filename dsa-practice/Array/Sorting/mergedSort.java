import java.util.Scanner;
public class mergedSort {
    static Scanner sc = new Scanner(System.in);
    static void printArray(int arr[]) {
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void createArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void devide(int arr[], int left, int right) {
        if(left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        devide(arr , left , mid);
        devide(arr , mid + 1 , right);
        merge(arr , left , mid , right);
    }
    public static void merge(int arr[], int left,int mid , int right) {
        int merged[] = new int[right - left + 1];
        int arr1 = left;
        int arr2 = mid + 1;
        int x = 0;
        while(arr1 <= mid && arr2 <= right){
            if(arr[arr1] < arr[arr2]){
                merged[x] = arr[arr1];
                x++;
                arr1++;
            }else{
                merged[x] = arr[arr2];
                x++;
                arr2++;
            }
        }
        while(arr1 <= mid){
            merged[x] = arr[arr1];
            x++;
            arr1++;
        }
        while(arr2 <= right){
            merged[x] = arr[arr2];
            x++;
            arr2++;
        }
        for(int i = 0, j = left;j < arr.length && i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        createArray(arr);
        devide(arr, 0,arr.length - 1);
        printArray(arr);
        sc.close();
    }
}