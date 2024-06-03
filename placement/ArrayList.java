import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList
 */

class Employes {
    String name;
    int salary;

    Employes(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "name = " + name + " salary = " + salary;
    }
}

class Arraylist {
    public static void main(String[] args) {

        ArrayList<Employes> al = new ArrayList<Employes>();

        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt", true))) {
            String str[], line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                str = line.split(",");
                al.add(new Employes(str[0], Integer.parseInt(str[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(
                al);

        Iterator<Employes> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(
                    itr.next());
        }
        System.out.println("samosa");
    }
}
