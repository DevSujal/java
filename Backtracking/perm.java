public class perm {

    public static void permutation(String str, String perm, int index, int count) {
        if (0 == str.length()) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            permutation(str.substring(0, i) + str.substring(i + 1), perm + str.charAt(i), index + 1, 0);

        }
    }

    public static void main(String[] args) {
        permutation("abc", "", 0, 0);
    }

}