
public abstract class BankAccount {
	int accountNo;
	String adharNo;
	String oname;
	float roi;
	double balance;

	BankAccount(String adharNo, String oname, double balance) {

		this.openAccount();
		this.adharNo = adharNo;
		this.oname = oname;
		this.balance = balance;
	}

	BankAccount() {
	}

	void openAccount() {
		if (this instanceof SavingAccount) {
			accountNo = AccountNoGenerator.getSavingAccount();
		} else if (this instanceof FixedDepositAccount) {
			accountNo = AccountNoGenerator.getFdAccount();
		}
	}

	public String toString() {

		return ("\n====================== Account Details ======================\nAccount Number : " + accountNo + "\nOwner Name : " + oname + "\nAdhar Number : " + adharNo
				+ "\nROI : " + roi + "\nAccount Balance  : " + balance  + "\n");
	}

	abstract void deposit(double amount);

	abstract void updateInterest();

	abstract void closeAccount();

}
