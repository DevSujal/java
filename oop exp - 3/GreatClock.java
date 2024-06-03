class AdvanceTime extends Time {
	int seconds, miliSeconds;

	AdvanceTime() {
		super();
	}

	AdvanceTime(int hours, int minutes, int seconds, int miliSeconds) {
		super(hours, minutes);

		this.seconds = seconds;
		this.miliSeconds = miliSeconds;
	}

	public String toString() {
		return (super.toString() + ":" + " " + this.seconds + " " + ":" + " " + this.miliSeconds);
	}

	AdvanceTime addTime(AdvanceTime g1) {

		AdvanceTime g3 = new AdvanceTime();

		g3.miliSeconds = g1.miliSeconds + this.miliSeconds;

		if (g3.miliSeconds > 999) {
			g3.seconds += 1;
			g3.miliSeconds -= 1000;
		}

		g3.seconds += g1.seconds + this.seconds;

		if (g3.seconds > 59) {
			g3.minutes += 1;
			g3.seconds -= 60;
		}

		Time t3 = new Time();
		t3 = super.addTime(g1);
		g3.hours = t3.hours;
		g3.minutes += t3.minutes;

		return g3;
	}

	AdvanceTime subTime(AdvanceTime g1) {
		AdvanceTime g3 = new AdvanceTime();

		g3.miliSeconds = g1.miliSeconds - this.miliSeconds;
		g3.seconds = g1.seconds - this.seconds;

		if (g3.miliSeconds < 0 && g3.seconds > 0) {
			g3.miliSeconds += 1000;
			g3.seconds -= 60;
		}

		else if (g3.miliSeconds > 0 && g3.seconds < 0) {
			g3.miliSeconds = 1000 - g3.miliSeconds;
			g3.seconds += 60;
		}

		g3.miliSeconds = Math.abs(g3.miliSeconds);
		g3.seconds = Math.abs(g3.seconds);

		Time t3 = new Time();
		t3 = super.subTime(g1);

		g3.hours = t3.hours;
		g3.minutes = t3.minutes;

		return g3;
	}
}
