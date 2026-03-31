import java.util.Scanner;
public class binary_Search_2D_Array{
    static Scanner sc = new Scanner(System.in);
    public static int binary_search(int arr[][] , int element){
        int left = 0 ;
        int right = arr.length - 1 ;
        while(left <= right){
            int mid = left + (right - left) / 2 ;
            if(arr[mid][mid] == element){
                return mid ;
            }
            else if(arr[mid][mid] < element){
                left = mid + 1 ;
            }
            else{
                right = mid - 1 ;
            }
        }
        return -1 ;
    }
    public static int[][] create_matrix(int rows , int columns){
        int matrix[][] = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix ;
    }
    public static void print_matrix(int matrix[][]){
        System.out.println("The matrix is: ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of matrix: ");
        int columns = sc.nextInt();
        int matrix[][] = create_matrix(rows , columns);
        print_matrix(matrix);
        System.out.print("Enter the element to be searched: ");
        int element = sc.nextInt();
        int index = binary_search(matrix , element);
        if(index != -1){
            System.out.println("Element found at index " + index + ".");
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}