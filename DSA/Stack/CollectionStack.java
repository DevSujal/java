// package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack <String> myStack = new Stack<>();
        myStack.push("sujal");
        myStack.push("is");
        myStack.push("name");
        myStack.push("my");

        ArrayList<String> myString = new ArrayList<>();

        while(!myStack.isEmpty()){
            myString.add(myStack.pop());
        }
        myStack.push("pagal");

        while(!myString.isEmpty()){
            myStack.push(myString.remove(myString.size() - 1));
        }
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
