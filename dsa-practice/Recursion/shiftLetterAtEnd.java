import java.util.Scanner;
public class shiftLetterAtEnd {
    public static String shiftLetter(String str, char ch, int index, int count, String newstr){
        if(index == str.length()){
            for(int i = 0; i<count; i++){
                newstr += ch;
            }
            return newstr;
        }
        if(str.charAt(index) != ch){
            newstr += str.charAt(index);
        }
        else{
            count++;
        }
        return shiftLetter(str, ch, index+1, count, newstr);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String newstr = "";
        int count = 0;
        System.out.println(shiftLetter(str, ch, 0, count, newstr));  
        sc.close();
    }
}