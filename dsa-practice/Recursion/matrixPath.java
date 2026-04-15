import java.util.Scanner;
public class matrixPath{
    public static int countPaths(int i , int j , int n , int m){
        if(i >= n || j >= m){
            return 0;
        }
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        // int count = 0;
        // count = count + countPaths(i + 1 , j , n , m);
        // count = count + countPaths(i , j + 1 , n , m);

        int downPath = countPaths(i + 1 , j , n , m);
        int rightPath = countPaths(i , j + 1 , n , m);
        int count = downPath + rightPath;
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        int totalPaths = countPaths(0 , 0 , n, m);
        System.out.println("Total paths: " + totalPaths);
        sc.close();
    }
}