import java.util.Scanner;
public class substring1 {
    static void getsubstring1(String str , int index , String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return ;
        }
        // include the character
        getsubstring1(str , index + 1 , newstr + str.charAt(index));
        // exclude the character
        getsubstring1(str , index + 1 , newstr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newstr = "";
        getsubstring1(str , 0 , newstr);
        sc.close();
    }
}
