import java.util.*;
public class Recursion3 {
  static boolean check = true;
   boolean checkSort(int array[], int size){
       if(size == 0){
        return check;
       }
    //    if(array[size] <= array[size-1]){
    //    System.out.println("array was not sorted");
    //    return;
    //    }
           checkSort(array, size-1);
     if(array[size-1] >= array[size]){
      check = false;
    }
        return check;
  }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int array[] = new int[size];
      System.out.println("enter elements of an array: ");
      for(int i = 0; i < size; i++){
        array[i] = sc.nextInt();
      }
      Recursion3 sort = new Recursion3();
     boolean check = sort.checkSort(array, size-1);
     if(check ==  true){
      System.out.println("array was sorted");
     }
     else
     System.out.println("array was not sorted");
    }
}
