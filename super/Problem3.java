public class Problem3 {
    public static int arrangeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        // horizontally 
        int hor = arrangeTiles(n-1,  m);

        // vertically
        int ver = arrangeTiles(n-m,  m);

        return hor + ver;
    }
    public static void main(String[] args) {

        System.out.println(arrangeTiles(2,  2));
        
    }
}
