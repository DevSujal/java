import java.util.ArrayList;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many prrsons you have to add : ");
        int n = sc.nextInt();
        ArrayList al = new ArrayList();

        while (n != 0) {
            System.out.print("enter name : ");
            String str = null;
            str = sc.next();
            al.add(str);
            n--;
        }
        System.out.println(al);

        System.out.print("enter the name to remove : ");
        String name1 = null;
        name1 = sc.next();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(name1)) {
                al.remove(i);
            }
        }
        System.out.println("the name is removed");
        System.out.println(al);
        al.add(1, ("sujal"));
        System.out.println("our own name is added to the seconod position");
        System.out.println(al);
        al.add(("N modi"));
        System.out.println("n modi is added to the last position");
        System.out.println(al);

        System.out.print("enter the name to replace : ");
        name1 = sc.next();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(name1)) {
                al.set(i, ("newName"));
            }
        }
        System.out.println("entered name was replaced");
        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {

            if (al.get(i) instanceof String) {
                System.out.print(al.get(i) + " enter the age for this person : ");
                int age = sc.nextInt();
                al.add(i+1, age);

            }
        }
        System.out.println(al);
        sc.close();
    }
}
