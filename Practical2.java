
class Prime {
    double amount;

    int cart;

    void checkDiscount(int cart, double amount) {
        System.out.println("Without discount amount = " + amount);
        if (cart > 1000) {
            System.out.println("You will get 30% off");
            amount = amount * 0.3;
        } else {
            System.out.println("You will get 20% off");
            amount *= 0.2;
        }
        System.out.println("With discount amount = " + amount);
    }
}

class Regular {
    double amount;
    String promo;
    int cart;

    void checkDiscount(int cart, double amount, String promo) {
        System.out.println("Without discount amount = " + amount);
        if (promo != "GET10") {
            System.out.println("you will not get any discount");
            return;
        }
        if (cart >= 500) {
            System.out.println("You will get 10% off");
            amount = amount * 0.1;
        } else {
            System.out.println("You will get rupees 10 off");
            amount -= 10;
        }
        System.out.println("With discount amount = " + amount);
    }
}
