public class Print implements Runnable {

    public void run() {
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("run method is running");
        //     try {
        //         Thread.sleep(3000);
        //     } catch (Exception e) {
        //         System.out.println("i am sujal".toUpperCase());
        //     }
        // }
        // System.out.println("current thread is : " + Thread.currentThread().isDaemon());
        System.out.println("run method called");
    }
}
