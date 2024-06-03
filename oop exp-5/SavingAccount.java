public class SavingAccount extends BankAccount implements Debitable {

    SavingAccount() {
    }

    SavingAccount(String adharNo, String oname, double balance) {
        super(adharNo, oname, balance);
    }

    public String toString() {
        return (super.toString());
    }

    void deposit(double amount) {
        this.balance += amount;
        System.out.println(
                "Your account has been credited with " + amount + "\nYour updated Account Balance is : " + this.balance);
    }

    void updateInterest() {
        this.roi = 4;
        balance += ((balance * roi) / 100);
        System.out.println("balance After adding interest : " + balance);
    }

    void closeAccount() {
        System.out.println("Account closed\nAmount Refunded : " + balance);
        balance -= balance;
        System.out.println("Available Balance : " + balance);
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Error on withdraw!");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " has been debited from your account \nYour Account Balance is : " + this.balance);
    }
}
