public class TestDemo {
    public static void main(String[] args) {
        Earnings e1 = Earnings.getEarnings();
        Earnings e2 = Earnings.getEarnings();

        System.out.println(e1);
        System.out.println(e2);

        if(e1.hashCode() == e2.hashCode()){
            System.out.println("Our Singleton Design Pattern Works perfectly");
        }
    }
}

final class Earnings {

    private static Earnings earnings;

    private Earnings() {
        throw new RuntimeException();
    }

    public static Earnings getEarnings() {
        if (earnings == null) {
            synchronized (Earnings.class) {
                earnings = new Earnings();
            }
        }
        return earnings;
    }
}