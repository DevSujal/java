import java.util.*;

public class Object {

    public static void main(String[] args) {
        Student s[] = new Student[10];

        Scanner sc = new Scanner(System.in);

        int rollNo;
        String name;
        int totalMarks;

        for (int i = 0; i < 10; i++) {
            rollNo = sc.nextInt();
            totalMarks = sc.nextInt();
            name = sc.nextLine();
            s[i] = new Student(rollNo, name, totalMarks);
            s[i].findPercentage();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(s[i]);
        }
        // CustomInteger c1 = new CustomInteger(34);
        // CustomInteger c2 = new CustomInteger(36);
        // CustomeDouble c3 = new CustomeDouble(46.0);

        // System.out.println(c1.add(c1.num1, c2.num1));
        // System.out.println(c1.add(c1.num1, c3.num2));

        sc.close();
    }
}
