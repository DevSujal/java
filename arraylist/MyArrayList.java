import java.util.ArrayList;
import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
      
        for(int i = 0; i <= al.size(); i++){
            al.add(i+1);

            if(i > 9){
                break;
            }
        }

        System.out.println(al);

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) {
            Integer aain = itr.next();
            System.out.println(aain);
            if(aain == 2){
                itr.remove();
            }
        }
        System.out.println(al);

        Collections.sort(al);

        Collections.sort(al, new DesendSort());
        System.out.println(al);

        al.set(1, 0);

        System.out.println(al);
    }
}

class DesendSort implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        return i1-i2;
    }

}