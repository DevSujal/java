import java.util.*;
public class RemoveDuplicates {
    // Q3 ans
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
           int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter the size of array :");

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < array.length; i++){
             for(int j = i+1; j < array.length-1; j++){
                if(array[i] == array[j]){
                    array[j] = 0;
                }
             }
        }
       
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        } 
    }
}
