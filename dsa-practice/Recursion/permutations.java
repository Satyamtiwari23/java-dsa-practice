import java.util.Scanner;
public class permutations {
    public static int printpermutations(String str , String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return 1;
        }
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char CurrentChar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1, str.length());
            count += printpermutations(newstr , permutation + CurrentChar);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int totalPermutations = printpermutations(str , "");
        System.out.println("Total permutations: " + totalPermutations);
        sc.close();
    }
}