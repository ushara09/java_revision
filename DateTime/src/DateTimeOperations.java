import java.time.*;

public class DateTimeOperations {
    public static void calculateTimePeriod(){
        //Get the current date
        LocalDate today = LocalDate.now();

        //Christmas Date of 2021
        LocalDate christmasDayofThisYear = LocalDate.of(today.getYear(), Month.DECEMBER, 25);

        //Calculate period left from current date to christmas
        Period howLongForChirstmas = Period.between(today, christmasDayofThisYear);

        System.out.println("the period : "+ howLongForChirstmas);

        //Extracting the elements years, months and Dates
        int years = howLongForChirstmas.getYears();
        int months = howLongForChirstmas.getMonths();
        int days = howLongForChirstmas.getDays();

        System.out.println("Years  : " + years);
        System.out.println("Months : " + months);
        System.out.println("Days   : " + days);
    }

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDateTime futureDateTime = currentDateTime
                .plusYears(1) // Add one year to "current date and time
                .plusDays(2) // Add two days
                .plusHours(3); //Add three more hours

        boolean isBefore = futureDateTime.isBefore(currentDateTime); //false
        boolean isAfter = futureDateTime.isAfter(currentDateTime); //true

//        System.out.println(futureDateTime);
//        System.out.println(isBefore);
//        System.out.println(isAfter);

        calculateTimePeriod();
    }

}
