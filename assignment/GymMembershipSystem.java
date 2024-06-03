class GymMembershipSystem {

    static String gymName = "Power Gold GYM";
    String membershipPlan;
    double amount;

    void display() {
        System.out.println("membership Plans");
        System.out.println("Regular: Rs. 12,000 per year\n Prime: Rs. 24,000 per year");
    }


    void display(int month) {

        System.out.println("your " + month + " month plan consist of" + amount / 6 + " rupees");
    }

}