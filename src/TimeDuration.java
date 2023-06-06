public class TimeDuration {

    public static void main(String[] args) {
        String startTime = "09:30";
        String endTime = "14:15";


        int startHours = Integer.parseInt(startTime.substring(0, 2));
        int startMinutes = Integer.parseInt(startTime.substring(3));
        int endHours = Integer.parseInt(endTime.substring(0, 2));
        int endMinutes = Integer.parseInt(endTime.substring(3));


        int diffHours = endHours - startHours;
        int diffMinutes = endMinutes - startMinutes;


        if (diffMinutes < 0) {
            diffHours--;
            diffMinutes += 60;
        }


        System.out.println("Time difference: " + diffHours + " hours and " + diffMinutes + " minutes.");
    }
}
