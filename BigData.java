import java.util.*;

// This is the program which adds two very very big numbers
public class BigData {
    public static int[] addNumber(String n1, String n2) {
        int carry = 0;
        int max = (n1.length() > n2.length()) ? n1.length() : n2.length();
        int arr1[] = new int[max]; // creating array to store numbers
        int arr2[] = new int[max];
        int arrSum[] = new int[max + 1];

        // assigning value to the arrays
        for (int i = 0; i < n1.length(); i++) {
            arr1[i] = n1.charAt(n1.length() - i - 1) - 48;
        }
        for (int i = 0; i < n2.length(); i++) {
            arr2[i] = n2.charAt(n2.length() - i - 1) - 48;
        }
        for (int i = 0; i < max; i++) {
            arrSum[i] = (arr1[i] + arr2[i] + carry) % 10; // calculating sum of each indexing strting from last

            if (arr1[i] + arr2[i] + carry >= 10) { // this is the condition which checks carry generated or not
                carry = 1;
            } else
                carry = 0;
        }
        arrSum[max] = carry; // assigning carry to the first index

        return arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "enter the first large number : ");
        String num1 = sc.nextLine(); // taking big numbers input fro user with the help of string
        System.out.print(
                "enter the first large number : ");
        String num2 = sc.nextLine();

        int outputArray[] = addNumber(num1, num2);

        System.out.print(
                "the sum of entered number is : ");
        for (int i = 0; i < outputArray.length / 2; i++) {
            outputArray[i] += outputArray[outputArray.length - 1 - i];
            outputArray[outputArray.length - 1 - i] = outputArray[i] - outputArray[outputArray.length - 1 - i];
            outputArray[i] -= outputArray[outputArray.length - 1 - i];
        }
        for (int i = 0 ; i < outputArray.length; i++) {
           if (i == 0 && outputArray[i] == 0) {
                continue;
            }
            System.out.print(
                    outputArray[i]
            );
        }
        sc.close();
    }
}