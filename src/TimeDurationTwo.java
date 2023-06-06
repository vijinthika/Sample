import java.time.Duration;
import java.time.LocalTime;

public class TimeDurationTwo {

        public static void main(String[] args) {
                LocalTime startTime = LocalTime.of(9, 30);
                LocalTime endTime = LocalTime.of(14, 15);


                Duration duration = Duration.between(startTime, endTime);


                long hours = duration.toHours();
                long minutes = duration.toMinutes() % 60;


                System.out.println("Time difference: " + hours + " hours and " + minutes + " minutes.");
            }
}
