class AccountNoGenerator {
	static int number = 54999;
	static int number2 = 10999;

	static int getFdAccount() {
		number++;
		return number;
	}

	static int getSavingAccount() {
		number2++;
		return number2;
	}
}
