public class Problem4 {
    public static int waysTOInvite(int n){

        if(n <= 1){
            return 1;
        }

        // if(n == 0){
        //     return 0;
        // }

        // Single invitation
        int single = waysTOInvite(n-1);

        // paired invitation
        int pair = (n-1) * waysTOInvite(n-2);

        return single + pair;

    }

    public static void main(String[] args) {

        System.out.println(waysTOInvite(4));
        
    }
}
