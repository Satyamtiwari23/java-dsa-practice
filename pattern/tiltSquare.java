import java.util.Scanner;
public class tiltSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= ((n*2)) ; j++){
                if(j > n - i  &&  j <= (2*n)-i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        sc.close();
    }
}
//         * * * * *     
//       * * * * *       
//     * * * * *         
//   * * * * *           
// * * * * *       