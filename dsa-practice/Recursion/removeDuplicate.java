import java.util.Scanner;
public class removeDuplicate{
    public static boolean map[] = new boolean[26];
    public static void rm_dup(String str , int idx , String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char current_char = str.charAt(idx);
        if(map[current_char -'a'] == true){
            rm_dup(str, idx+1, newstr);
        }else{
            newstr = newstr + current_char;
            map[current_char - 'a'] = true;
            rm_dup(str, idx+1, newstr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String newstr = "";
        rm_dup(str , 0 , newstr);
        sc.close();
    }
}