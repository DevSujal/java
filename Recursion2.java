import java.util.*;
public class Recursion2 {
    public static void towerOfhanoi(int n, String src, String helper, String dest){
      if(n == 0){
        return;
      }
      towerOfhanoi(n-1, src, dest, helper);
      System.out.println("the disk are transfered form " + src+ " to " + dest);
      towerOfhanoi(n-1, helper, src, dest);
    }
    public static void reverseString(StringBuilder name, int i){
        if(i > (name.length()-1)/2){
            return;
        }
        char temp = name.charAt(i);
        name.setCharAt(i, name.charAt(name.length() - i-1));
        name.setCharAt(name.length() - i-1, temp);
        
        reverseString(name, i+1);
    }
    
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int i = 0;
     int n = sc.nextInt();
     towerOfhanoi(n, "Soruce", "Helper", "Destiny");
    //  String name = sc.nextLine();
    // StringBuilder name2 = new StringBuilder(name);
    //  reverseString(name2, i);
    //  System.out.println(name2);
    }
}
