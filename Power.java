import java.util.*;
public class Power{
    public static int powerOfnumber(int sum, int x, int n){
          if(n == 0){
            return sum;
          }  
          sum *= x;
          return powerOfnumber(sum, x, n-1);
        
    }
    public static int powerNum(int x, int n){
      if(n == 0){
        return 1;
      }
      if(x == 0){
        return 0;
      }
      int ans = powerNum(x, n-1);
      int realans = x*ans;
      return realans; 
    }
    public static int lessTime(int x,int n){
      if(n == 0){
        return 1;
      }
      if(x == 0){
        return 0;
      }
     //  For even value of n
      if(n % 2 == 0){
       return lessTime(x, n/2)*lessTime(x, n/2);
      }
     // For odd value of n
     else
     return lessTime(x, n/2)*lessTime(x, n/2)*x;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n  = sc.nextInt();
        int sum = 1;
       int s = powerOfnumber(sum, x, n);
       int ans = powerNum(x, n);
       int realans = lessTime(x, n);
       System.out.println("the power of enterd number is "+ s);
       System.out.println("the power of enterd number is "+ ans);
       System.out.println("the power of enterd number is "+ realans);
    }
}