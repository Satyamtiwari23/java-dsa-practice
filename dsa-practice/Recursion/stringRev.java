import java.util.Scanner;
public class stringRev{
    public static void stringReverse(String str , int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringReverse(str , index-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        stringReverse(str ,str.length()-1);
        sc.close();
    }
}