public class BookSeats {

    int totalSeats = 10;

   synchronized void bookSeats(int seats) {
        if (seats <= totalSeats) {
            totalSeats = totalSeats - seats;
            System.out.println("thread = " + Thread.currentThread().getName());
            System.out.println("seats are booked\nseats are left : " + totalSeats);
        } else {
            System.out.println("thread = " + Thread.currentThread().getName());
            System.out.println("sorry seats are booked\nseats are left : " + totalSeats);
        }
    }
}
