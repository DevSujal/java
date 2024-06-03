public class KeypadCombination {
    //  Keypad 
    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeyPad(String str, int idx, String Comb){
        if(idx == str.length()){
            System.out.println(Comb);
            return;
        }
        String mapping = keypad[str.charAt(idx) - '0'];
        for(int i = 0; i < mapping.length(); i++){
            printKeyPad(str, idx+1, Comb + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printKeyPad("236", 0, "");
    }
}
