public class Movie extends Thread {

    static BookSeats b1 = new BookSeats();
    int seats;

    Movie(int seats) {
        this.seats = seats;
    }

    public void run() {

        b1.bookSeats(seats);

    }
}
