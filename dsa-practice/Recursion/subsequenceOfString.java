import java.util.Scanner;
public class subsequenceOfString{
    public static void printSubsequences(String str , int index , String newstring){
        if(index == str.length()){
            System.out.print(newstring + "\n");
            return;
        }
        //include the charater
        printSubsequences(str , index+1 , newstring + str.charAt(index));
        //exclude the character
        printSubsequences(str , index+1 , newstring);
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.println("The subsequences of the string are: ");
        printSubsequences(str,0 , "");
        sc.close();
    }
}