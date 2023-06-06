
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateIntervalTwo {
        public static void main(String[] args) {
            // Define the two dates
            LocalDate date1 = LocalDate.of(2022, 4, 15);
            LocalDate date2 = LocalDate.of(2023, 5, 10);

            // Calculate the number of days between the two dates
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);

            System.out.println("Number of days between the two dates: " + daysBetween);
        }
    }

