import java.util.*;
public class Strings {
    static int count = 0;
   static String news = "";
    public static void replaceX(String str, char ch, int idx){
        if(idx == str.length()){
            while(count != 0){
                news += ch;
                count--;
            }
            return;
        }
        if(ch == str.charAt(idx)){
            count++;
        }
        else
        news += str.charAt(idx);
        replaceX(str, ch, idx+1);
    }
public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    String str  = sc.nextLine();
    char ch = sc.next().charAt(0);
    replaceX(str, ch, 0);
    System.out.println(news);
    }
}
