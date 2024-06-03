
public class TwoStacksInArray {

    static class Stack {
        int arr[], size, top;

        Stack(int size) {
            this.arr = new int[size];
            this.size = size;
            top = -1;
        }

        public void push(int element, int stackno) {

            if (stackno < 1 || stackno > 2) {
                System.out.println("Invalid stack number");
                return;
            }

            if (stackno == 1) {
                if (top == size - 1) {
                    System.out.println("Stack is full");
                    return;
                }
                arr[++top] = element;
                return;
            }
            if (size == top + 1) {
                System.out.println("stack is full");
                return;
            }
            arr[--size] = element;
        }

        public int pop(int stackno) {

            if (stackno < 1 || stackno > 2) {
                System.out.println("Invalid stack number");
                return -1;
            }

            if (stackno == 1) {
                if (top == -1) {
                    System.out.println("stack is empty");
                    return -1;
                }
                return arr[top--];
            }
            if (size == arr.length) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[size++];
        }

        public void display() {

            System.out.print("-> ");
            for (int i : arr) {
                if (i == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(i + " ");
            }
            System.out.println("<-");

        }

        public static void main(String[] args) {
            Stack s1 = new Stack(10);
            s1.push(1, 1);
            s1.push(2, 1);
            s1.push(3, 1);
            s1.push(4, 2);
            s1.push(5, 2);
            s1.push(6, 2);
            s1.push(6, 2);

            System.out.println(s1.pop(2));
            System.out.println(s1.pop(2));

            System.out.println(s1.pop(2));
            System.out.println(s1.pop(2));
            System.out.println(s1.pop(2));
            s1.push(10, 2);

            s1.display();
            s1.push(90, 3);
            s1.pop(3);
        }
    }

}