import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);

        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);

        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);

        Instant instantNow = Instant.now();
        System.out.println(instantNow);

        LocalDateTime localDateTimeNowInBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localDateTimeNowInBerlin);

        LocalDate birthday = LocalDate.of(1994, Month.FEBRUARY, 2);
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.plusYears(27).getDayOfWeek());
        System.out.println(birthday.plusYears(27).isBefore(localDateTimeNow.toLocalDate()));
    }
}
