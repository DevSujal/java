
public class TimeZone {
    Time time;

    TimeZone(int hours, int minutes) {
        this.time = new Time(hours, minutes);
    }

    void convertTo(TimeZone targetTimeZone) {
        System.out.println("Converted Time: " + time.addTime(targetTimeZone.time));
    }

    void convertFrom(TimeZone sourceTimeZone) {
        System.out.println("Converted Time: " + time.subTime(sourceTimeZone.time));
    }

}