import java.util.Scanner;
public class checkSortedArray{
    public static boolean checkSorted(int arr[] , int n){
        if(n == arr.length-1){
            return true;
        }
        if(arr[n] >= arr[n+1]){
            return false;
        }
        return checkSorted(arr, n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkSorted(arr, 0));
        sc.close();
    }
}