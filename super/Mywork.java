import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Mywork {
    public static void main(String[] args) {
        double m = 2.91, c =  1.05 *  0.09667;
        try(BufferedReader b1 = new BufferedReader(new FileReader("input.txt"))){
            String str[], line;
            while((line = b1.readLine()) != null){
                str = line.split(",");
                System.out.println(((Double.parseDouble(str[0]) * m + c)));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
