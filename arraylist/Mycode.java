
public class Mycode {
    static String name = "sujal nimje";

    static class Sample {
        // String name = "sujal nimje";
        void msg() {
            System.out.println("this is static nested class i am ".toUpperCase() + name.toUpperCase());
        }

        static class Sample2 {
            void msg() {
                System.out.println("kuch bhi : "+ name);
            }
        }
    }

    public static void main(String[] args) {
        // Mycode.Sample.Sample2 m1 = new Mycode.Sample.Sample2();
        Sample.Sample2 m1 = new Sample.Sample2();
        // System.out.println(m1.name);
        m1.msg();
    }
}