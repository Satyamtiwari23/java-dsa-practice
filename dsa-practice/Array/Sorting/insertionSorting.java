/* In insertion sort, we build the final sorted array by assuming that 
the first element is already sorted, and then we insert the remaining 
elements into their correct positions. The process is as follows:
1.start from second element (first element is considered sorted)
2.pick current element → isko “key” bolte hain
3.Compare key in left part(already sorted part)
4.Compare karo previous elements se
5.Until key is greater than previous element, shift previous element to the right
6.Jab sahi position mil jaaye → key ko wahan insert kar do
7.Ye process har element ke liye repeat karo
*/
import java.util.Scanner;
public class insertionSorting {
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
    public static void insertionSort(int arr[]) {
        for(int i = 1 ; i < arr.length ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        createArray(arr);
        insertionSort(arr);
        printArray(arr);
        sc.close();
    }
}
