
public class Multithreding {

}

class SimpleThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println("run method has been working!\n");
    }

    public static void main(String[] args) {
        SimpleThread s1 = new SimpleThread();
        s1.setPriority(MIN_PRIORITY);
        s1.setName("firstThread");
        s1.start();

        SimpleThread s2 = new SimpleThread();
        s2.setPriority(MAX_PRIORITY);
        s2.setName("secondThread");
        s2.start();
    }
}

class Test<T extends Number> extends Thread {

    int start;
    int end;
    T[] array;

    Test(int start, int end, T[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    public void run() {
        System.out.println("run method has been working!\n");
        this.addArray();
    }

    static double sum = 0;

    public void addArray() {

        for (int i = start; i < end; i++) {
            sum += array[i].doubleValue();
            System.out.println(Thread.currentThread());
        }
    }
}

class Test2 {

    public static void main(String[] args) {

        Integer array[] = new Integer[100];
        // Double array2[] = { 1.0, 2.0, 2.5, 3.5, 5.0 };

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        Test<Integer> t1 = new Test<Integer>(0, 25, array);
        t1.setName("first");
        t1.start();

        Test<Integer> t2 = new Test<Integer>(25, 50, array);
        t2.setName("second");
        t2.start();

        Test<Integer> t3 = new Test<Integer>(50, 75, array);
        t3.setName("third");
        t3.start();

        Test<Integer> t4 = new Test<Integer>(75, 100, array);
        t4.setName("fourth");
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Test.sum);

        if ((50 * 101) == Test.sum) {
            System.out.println("Chal gaya program garibo me pedhe batvao");
        }

    }
}

class Demo extends Thread {
    public void run() {
        System.out.println("i am sujal".toUpperCase());
        name();
    }

    void name() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
    }
}

class Earnings extends Thread {

    int totalEarnings = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                totalEarnings += 100;
            }
            notify();
        }
    }
}

class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Earnings e = new Earnings();
        e.start();

        synchronized (e) {
            e.wait();
        }
        System.out.println(e.totalEarnings);
    }
}
