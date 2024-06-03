public class permutation {
    public static void perm(int n, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        for(int i = 1; i <= n; i++){
            str += i;
        }
    }
    public static void main(String[] args) {
        perm(3, "");
    }
}
