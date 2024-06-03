public class Time {
	int hours, minutes;

	Time() {
	}

	Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public String toString() {
		return (this.hours + " " + ":" + " " + this.minutes + " ");
	}

	Time addTime(Time t1) {
		Time t3 = new Time();

		t3.minutes += t1.minutes + this.minutes;

		if (t3.minutes > 59) {
			t3.hours += 1;
			t3.minutes -= 60;
		}

		t3.hours += t1.hours + this.hours;

		if (t3.hours > 23) {
			t3.hours -= 24;
		}

		return t3;
	}

	Time subTime(Time t1) {
		Time t3 = new Time();

		t3.minutes = t1.minutes - this.minutes;
		t3.hours = t1.hours - this.hours;

		if (t3.minutes < 0 && t3.hours > 0) {
			t3.minutes += 60;
			t3.hours -= 1;
		}

		else if(t3.minutes > 0 && t3.hours < 0){
			t3.minutes = 60 - t3.minutes;
			t3.hours += 1;
		}

		t3.hours = Math.abs(t3.hours);
		t3.minutes = Math.abs(t3.minutes);

		return t3;
	}
}
