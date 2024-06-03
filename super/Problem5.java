public class Problem5 {
    public static void printSubset(int n, int idx, String str){

        if(idx > n){
            System.out.println(str);
            return;
        }


        // agar vo aana chahta hai
        printSubset(n, idx + 1, str + idx);

        // agar vo nahi aana chahta
        printSubset(n, idx + 1, str);

    }
    public static void main(String[] args) {

        printSubset(3, 1, "");
        
    }
}
