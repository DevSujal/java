import java.util.*;
public class Twodarray{
    public static void main (String args[]){
//    System.out.println("Hello World!");
  Scanner sc = new Scanner(System.in);
  System.out.print("enter number of rows: ");
  int rows = sc.nextInt();
  System.out.print("enter number of columns: ");
  int columns = sc.nextInt();

  int matrix[][] = new int [rows][columns];
 //Taking matrix input
  for(int i = 0; i < rows; i++){
    for(int j = 0; j < columns; j++){
        System.out.print("matrix value[" + i +"]["+ j + "]: ");
        matrix[i][j] = sc.nextInt();
    }
  }
  // printing matrix
  for(int i = 0; i < rows; i++){
    for(int j = 0; j < columns; j++){
        System.out.print(matrix[i][j] + " ");

    }
    System.out.println();
}

  //   System.out.println("\nthe transpose of above matrix is below: ");
  //   // Transpose of matrix 
  //   for(int i = 0; i < rows; i++){
  //       for(int j = 0; j < columns; j++){
  //           System.out.print(matrix[j][i] + " ");
    
  //       }
  //   System.out.println();
  // }
  
 System.out.println("enter the number to serach in a matrix: ");
 int num = sc.nextInt();

 for(int i = 0; i < rows; i++){
  for(int j = 0; j < columns; j++){
    if(num == matrix[i][j]){
      System.out.println(num + "is prsent at " + i + "," + j + " loction in matrix");
      break;
    }
  }
 }
}
}
