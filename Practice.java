import java.util.*;

public class Practice {
    public static void main(String args[]){
        int temp;
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of an array: ");
     for(int i = 0; i < array.length; i++){
        array[i] = sc.nextInt();
     }
     // Q1 ans
     System.out.println("the minimum element is " + array[0] + " the maximum element is " + array[array.length-1]);

     //Q2 ans
     for(int i = 0; i < array.length-1; i++){
        for(int j = 0; j < array.length-i-1; j++){
            if(array[j] > array[j+1]){
               temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
            }
        }
     }
    System.out.println("the sorted array is: ");
    for(int i = 0; i < array.length; i++){
        System.out.println(array[i] + " ");
    }
    // Q4 
    System.out.println(" Second largest element = " + array[array.length-2]);
    }
}
