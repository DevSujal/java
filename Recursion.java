import java.util.*;
public class Recursion {
   static int x = 0;
    public static int sumNatural(int v){
    //   static int x = 0;
      if(v == 0){
        return x;
      }
      x += v;
      return sumNatural(v-1);
    }
    public static void reverseString(String name, int n){
      if(n < 0){
        return;
      }
      reverseString(name, n-1);
      System.out.print(name.charAt(name.length() - n - 1));
    }
    static int position = 0, count = 0;
    public static void occurenceOfelement(String name, int n, char ch){
      if(n == 0){ 
        return;
      }
      occurenceOfelement(name, n-1, ch);
      if( ch == name.charAt(n)){
        position = n;
         count++;
      }
       if(n ==  name.length()-1){
        System.out.println("the last occurnece of "+ ch + " is " + position);
       }
       if(count == 1 && ch == name.charAt(n)){
        System.out.println("the first occurnece of "+ ch + " is " + position);
       }

      
    }
    public static void main (String args[]){
       Scanner sc = new Scanner (System.in);
      //  System.out.print("enter number of first n natural number: ");
      //  int n = sc.nextInt();
      // int s = sumNatural(n);
      // System.out.println("the sum of first "+ n + " natural numbers is: "+s);
      // System.out.println("the sum of first "+ n + " natural numbers is: "+(n*(n+1)/2));
      String name = sc.nextLine();
      int n = name.length()-1;
      char ch = sc.next().charAt(0);
      // reverseString(name, n);
     occurenceOfelement(name, n, ch);
    }
    
}
