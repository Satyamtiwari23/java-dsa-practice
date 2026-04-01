import java.util.Scanner;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static int[][] create_matrix(int rows , int cols){
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] print_matrix(int[][] matrix){
        System.out.println("The matrix is: ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args){
        System.out.print("Enter number of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in matrix: ");
        int cols = sc.nextInt();

        int matrix[][] = create_matrix(rows , cols);
        print_matrix(matrix);
        
    }
}