import java.io.*;
import java.util.ArrayList;

public class Employ {
    String name, designation;
    int num, salary;

    Employ(int num, String name, String designation, int salary) {
        this.num = num;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void increament() {
        if (designation.equalsIgnoreCase("manager")) {
            System.out.println("30% increament will be given");
            this.salary += 0.3 * salary;
        } else if (designation.equalsIgnoreCase("salseman")) {
            System.out.println("20% increament will be given");
            this.salary += 0.2 * salary;
        } else if (designation.equalsIgnoreCase("clerk")) {
            System.out.println("10% increament will be given");
            this.salary += 0.1 * salary;
        }
    }

    public String toString() {
        return (name + " " + num + " " + designation + " " + salary);
    }
}

class Test {
    public static void main(String[] args) {

        ArrayList<Employ> al = new ArrayList<>();
        int i = 0;

        try (BufferedReader b = new BufferedReader(new FileReader("Employ.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("Employ1.txt", true))) {

            String line, str[] = null;
            while ((line = b.readLine()) != null) {
                str = line.split(",");
                al.add(new Employ(Integer.parseInt(str[0]), str[1], str[2], Integer.parseInt(str[3])));
                Employ e1 = al.get(i);
                e1.increament();
                bw.write(e1.toString());
                bw.newLine();
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
