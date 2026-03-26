
import java.util.Scanner;

public class Array1D {
    
    // Function to create array
    public static int[] createArray(int size) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    // Function to traverse array
    public static void traverseArray(int arr[]) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = createArray(size);
        traverseArray(arr);
        sc.close();
    }
}