
class MyPersonalExecption extends Exception {
    MyPersonalExecption(String msg) {
        super(msg);
    }
}

public class ExecptionHandling {
    public static void main(String[] args) {
        int age = 17;
        MyPersonalExecption me = new MyPersonalExecption("your age is not above 18");

        if (age < 18) {
            try {
                throw me;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else
            System.out.println("your age is above 18".toUpperCase());

        System.out.println("Thank you!");
    }
}
