import java.util.*;

public class SortArraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("how many prrsons you have to add : ");
        int n = sc.nextInt();
        ArrayList<Data> al = new ArrayList<>();

        while (n != 0) {
            System.out.print("enter name : ");
            String str = null;
            str = sc.next();
            System.out.print("enter age : ");
            int num = sc.nextInt();
            al.add(new Data(str, num));
            n--;
        }
        System.out.println(al);

        System.out.print("enter the name to remove : ");
        String name1 = null;
        name1 = sc.next();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).name.equals(name1)) {
                al.remove(i);
            }
        }
        System.out.println(al);
        al.add(1, new Data("sujal", 19));
        System.out.println(al);
        al.add(new Data("N modi", 65));
        System.out.println(al);

        System.out.print("enter the name to replace : ");
        name1 = sc.next();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).name.equals(name1)) {
                int age = al.get(i).age;
                al.set(i, new Data("newName", age));
            }
        }
        System.out.println(al);
        sc.close();
    }
}

class Data {
    String name;
    int age;

    Data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("name = " + name + " age = " + age);
    }
}