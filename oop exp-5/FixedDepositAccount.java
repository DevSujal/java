class FixedDepositAccount extends BankAccount implements Debitable {
	int lockInperiod;

	FixedDepositAccount(String adharNo, String oname,double balance, int lockInperiod) {

		super(adharNo, oname, balance);
		this.lockInperiod = lockInperiod;
	}

	public String toString() {
		return (super.toString());
	}

	void deposit(double amount) {
		System.out.println("you are not allowed to deposit");
	}

	void updateInterest() {
		if (lockInperiod >= 1 && lockInperiod <= 2) {
			roi = 6;
		} else if (lockInperiod > 2 && lockInperiod <= 5) {
			roi = (float) 6.5;
		} else if (lockInperiod > 5) {
			roi = 7;
		}
		System.out.println("Interest : " + ((balance * lockInperiod * roi) / 100));
		balance += ((balance * lockInperiod * roi) / 100);
        System.out.println("balance After adding interest : " + balance);		
	}

	void closeAccount() {
		int n = 6;
		if (n < lockInperiod) {
			System.out.println("=====================================\nAccount Closer : before lock in period!\nPenalty : " + (5 * balance / 100));
			balance -= 5 * balance / 100;
			System.out.println("Amount refunded : " + balance);
		} else{
			System.out.println("===================================\nAccount Closer : After lock in period ");
			this.updateInterest();
			System.out.println("Therefore Amount refunded : " + balance);
		}

	}

	public void withdraw(double amount) {
		System.out.println("YOU ARE NOT ALLOWED TO WITHDRAW MONEY");
	}
}
