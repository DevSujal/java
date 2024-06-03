public class Test {
    public static void main(String[] args) {

        Movie m1 = new Movie(7);
        m1.start();


        Movie m2 = new Movie(6);
        m2.start();

        Movie m3 = new Movie(2);
        m3.start();
    }
}
  // Thread t1 = new Thread(new Print());

        // System.out.print("kuch bhi");
        // System.out.print(Thread.currentThread().getName());
        // Thread.currentThread().setName("sujal");
        // System.out.print(Thread.currentThread().getName());
        // int c = 8/0;

        // t1.start();

        // System.out.print("Thank You");
        // System.out.print("very much");
        // System.out.print(Thread.currentThread().getName());
        // System.out.print(t1.isDaemon());
        // System.out.println("Thank You");
        // t1.setDaemon(true);
        // t1.start();

        // System.out.println("samosa");
        // System.out.println("aalubonda");
        // for (int i = 0; i < 7; i++) {
        //     System.out.println(i);
        // }
/*
 * class Iam extends Thread {
 * public void run() {
 * for (int i = 0; i < 3; i++) {
 * System.out.print("prajakta pagal");
 * try {
 * sleep(3000);
 * } catch (Exception e) {
 * System.out.print("i am sujal".toUpperCase());
 * }
 * }
 * }
 * 
 * public void run(int number) {
 * System.out.print("mai pagal");
 * }
 * 
 * public void start() {
 * System.out.print("start");
 * }
 * }
 */