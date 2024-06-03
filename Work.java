import java.util.*;
public class Work{

    public static double average(int[] salary) {
        int temp,  position = 0;
        double sum = 0;
        for(int i = 0; i < salary.length-1; i++){
             position = i;
            for(int j = i+1; j < salary.length; j++){
                if(salary[position] > salary[j]){
                   position = j;
                }
            }
                if(position != i){
                    temp =  salary[position];
                    salary[position] = salary[i];
                    salary[i] = temp;
                }
            
        }
            for(int i = 1; i <salary.length-1; i++){
                sum += salary[i]; 
                System.out.print(" "+salary[i]);
            }
        return (sum/(salary.length-2));
    }
    public static void main(String[] args) {
        int salary[] = new int[] {4000, 3000, 1000, 2000};
       double s = average(salary);
       System.out.println("\n"+s);
    }
}