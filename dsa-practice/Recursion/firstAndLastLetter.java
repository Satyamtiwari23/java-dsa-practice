
import java.util.Scanner;
public class firstAndLastLetter {
    public static void findIndex(String str ,char ch,int index , int first , int last){
        if(index > str.length()-1){
            System.out.println("First index: " + first);
            System.out.println("Last index: " + last);
            return;
        }
        if(str.charAt(index) == ch){
            if(first == -1){
                first = index;
            }
            last = index;
        }
        findIndex(str , ch , index+1 , first , last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int first = -1;
        int last = -1;
        findIndex(str , ch , 0 , first , last);
        sc.close();
    }
}
