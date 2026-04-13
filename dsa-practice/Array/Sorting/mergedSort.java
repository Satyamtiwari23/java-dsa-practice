/*Merge Sort (devide and conquer algorithm)
took input of number of elements in array and send in creaArray function which fills the array 
then sorted the array by first devide the array into two halves until we get single element 
of array by devide function , and then merge them using merge function and than again took 
another two halves and merge them and again and again until we get the whole array in the
merged array in merge function and then copy the merged array to original array and print 
the array which is now sorted.
*/
import java.util.Scanner;
public class mergedSort {
    public static void createArray(int arr[] , Scanner sc){
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int arr[] , int start , int end){
        for(int i=start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void devideArray(int arr[] , int start , int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        devideArray(arr , start , mid);
        devideArray(arr , mid + 1 , end);
        merge(arr , start , mid , end);
    }

    public static void merge(int arr[] , int start , int mid , int end){
        int merged[] = new int[end - start + 1];
        int indx1 = start , indx2 = mid + 1 , x = 0;
        while(indx1 <= mid && indx2 <= end){
            if(arr[indx1] <= arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1 <= mid){
            merged[x++] = arr[indx1++];
        }
        while(indx2 <= end){
            merged[x++] = arr[indx2++];
        }
        for(int i=0, j=start;j < arr.length && i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        createArray(arr , sc);
        devideArray(arr , 0 , arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr , 0 , arr.length - 1);
    }
}