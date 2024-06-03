package folder1;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileWork {
    public static void main(String[] args) {
        
        try(BufferedReader b = new BufferedReader(new FileReader("abc.txt"))){

            String line, str[] = null;
            while((line = b.readLine()) != null){
                str = line.split(",");
                System.out.println(str[0] + " " + str[1]);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
