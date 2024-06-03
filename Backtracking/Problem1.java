public class Problem1{
    // muze kuch nahi aata
    public static void printperm(String str, String perm, int idx){

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printperm(newStr, perm + currchar, idx + 1);
        }
    }

    public static void main(String[] args) {
        
        printperm("ABC", "", 0);
    }

}