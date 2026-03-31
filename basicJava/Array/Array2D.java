import java.util.Scanner;

public class Array2D {

    // Function to create 2D array
    public static int[][] createMatrix(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    // Function to traverse 2D array
    public static void traverseMatrix(int matrix[][]) {
        System.out.println("Matrix elements are:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int matrix[][] = createMatrix(rows, cols);
        traverseMatrix(matrix);
        sc.close();
    }
}