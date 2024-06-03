public class Subsequence {
    // Super important question
    public static void subSequence(String str, int idx, String newStr){
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    // agar vo jana chahta hai
    subSequence(str, idx + 1, newStr + str.charAt(idx)); 

    // agar vo nahi jana chahta
    subSequence(str, idx + 1, newStr);

    }      
    public static void main(String[] args) {
     
        subSequence("abc", 0, "");
        
    }
}
