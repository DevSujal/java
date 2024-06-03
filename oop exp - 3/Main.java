class Main {
	public static void main(String args[]) {

		Time t1 = new Time(2, 50);
		Time t2 = new Time(3, 45);

		System.out.println("Addition = " + t1.addTime(t2));
		System.out.println("Subtraction = " + t1.subTime(t2));

		AdvanceTime at1 = new AdvanceTime(2, 30, 5, 500);
		AdvanceTime at2 = new AdvanceTime(10, 24, 4, 500);
		AdvanceTime at3 = new AdvanceTime();

		at3 = at1.addTime(at2);
		System.out.println("the addition of two time objects is : " + at3);

		at3 = at1.subTime(at2);
		System.out.println("the subtraction of two time objects is : " + at3);

		TimeZone currentTime = new TimeZone(15, 0);
		TimeZone offset = new TimeZone(5, 30);
		TimeZone timeZone2 = new TimeZone(3, 0);

		// to convert time to another time zone ie + operation 
		currentTime.convertTo(offset);

		// to convert time from another time zone - operation
		currentTime.convertFrom(offset);
	}
}
