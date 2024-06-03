public class Test {
    public static void main(String[] args) {

        BankAccount customer[] = new BankAccount[4];

        SavingAccount s1 = new SavingAccount("1234 5678 9112", "Ganesh", 0);
        SavingAccount s2 = new SavingAccount("1234 5678 9000", "Bunti", 0);
        FixedDepositAccount f1 = new FixedDepositAccount("1111 5678 9000", "Bubli", 200000, 5);
        FixedDepositAccount f2 = new FixedDepositAccount("1111 2222 9000", "Vinayak", 200000, 5);

        s1.deposit(10000);
        s1.withdraw(20000);
        s1.updateInterest();
        System.out.println(s1);

        s2.deposit(50000);
        s2.withdraw(20000);
        s2.updateInterest();
        System.out.println(s2);
        s2.closeAccount();

        f1.deposit(50000);
        f1.withdraw(20000);
        System.out.println(f1);
        f1.closeAccount();

        f2.deposit(50000);
        f2.withdraw(20000);
        f2.closeAccount();
        System.out.println(f2);

    }
}
