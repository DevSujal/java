class practise {
    private practise() {
    }

    practise(String name) {
        System.out.println(name);
    }

    void info() {
        System.out.println("Hi I am Practice");
    }
}

class Sujal extends practise {
    Sujal() {
        super("Sujal");
    }

    void info() {
        System.out.println("Hi I am Sujal");
    }

    public static void main(String[] args) {
        Sujal s = new Sujal();
        s.info();
    }

}

// class pratik extends practise{
// void info(){
// System.out.println("Hi I am Pratik");
// }
// }

// class prajakta extends practise{
// void info(){
// System.out.println("Hi I am prajakta");
// }
// }

// class Main{
// public static void main(String[] args) {

// practise p[] = new practise[3];

// for(int i = 0; i < 3; i++){

// p[i] = new Sujal();
// p[i].info();
// }
// }
// }
