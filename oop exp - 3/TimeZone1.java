import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone1 {

    public static void main(String[] args) {
        // Define the original time and its time zone
        LocalDateTime originalTime = LocalDateTime.of(2023, 6, 17, 10, 30); // Example: June 17, 2023, 10:30 AM
        ZoneId originalTimeZone = ZoneId.of("America/New_York"); // Example: Eastern Standard Time (EST)

        // Define the target time zone
        ZoneId targetTimeZone = ZoneId.of("America/Los_Angeles"); // Example: Pacific Standard Time (PST)

        // Convert the time to the target time zone
        ZonedDateTime originalDateTime = ZonedDateTime.of(originalTime, originalTimeZone);
        ZonedDateTime targetDateTime = originalDateTime.withZoneSameInstant(targetTimeZone);

        // Format the target time for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy, HH:mm a");
        String formattedTargetTime = targetDateTime.format(formatter);

        // Print the converted time
        System.out.println("Converted time: " + formattedTargetTime);
    }
}

