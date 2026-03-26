import java.util.Scanner;
public class increaseNumPyramid {
    public static void main(String[] args) {
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 