import java.util.HashSet;
import java.util.Scanner;
public class uniquesubstring {
    public static void uniqueSub(String str , int index , String newstr , HashSet<String> hashset){
        if(index == str.length()){
            if(hashset.contains(newstr)){
                return ;
            }else{
                System.out.println(newstr);
                hashset.add(newstr);
                return ; 
            }
        }
        // include the character
        uniqueSub(str , index + 1 , newstr + str.charAt(index) , hashset);
        // exclude the character
        uniqueSub(str , index + 1 , newstr , hashset);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newstr = "";
        HashSet<String> hashset = new HashSet<>();
        uniqueSub(str , 0 , newstr , hashset);
        sc.close();
    }
}
