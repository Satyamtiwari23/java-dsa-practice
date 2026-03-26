import java.util.Scanner;
public class butterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        n=n*2;
        for(int i = 1 ; i <= n ; i++){
            if(i < n/2){
                for(int j = 1 ; j <= n ; j++){
                    if(j <= i || j > n-i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            else if(i == n/2){
                for(int j = 1 ; j <= n ; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j = 1 ; j <= n ; j++){
                    if(j > n-i && j < i+1){
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            } 
            System.out.println("  ");
        }
        sc.close();
    }
}
// *                 *   
// * *             * *   
// * * *         * * *   
// * * * *     * * * *   
// * * * * * * * * * *   
// * * * *     * * * *   
// * * *         * * *   
// * *             * *   
// *                 *  