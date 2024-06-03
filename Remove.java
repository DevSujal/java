public class Remove {

   static String newStr = " ";
  static boolean array[] = new boolean[26];

   static void removeDuplicates(String str, int idx) {
        // for(int i = 0; i < array.length; i++){
        //       System.out.println(array[i]);
        // }
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (array[currchar - 'a']) {
           removeDuplicates(str, idx + 1);
        }
        else{
            newStr += currchar;
            array[currchar - 'a'] = true;
            removeDuplicates(str, idx+1);
        }
        // removeDuplicates(str, idx+1);
    }
}

class Test2{
   public static void main(String[] args) {
  
  Remove.removeDuplicates("abbccdd", 0);
   }
}