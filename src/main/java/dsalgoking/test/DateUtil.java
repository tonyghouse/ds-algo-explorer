package dsalgoking.test;

import jakarta.annotation.Nonnull;

import java.time.LocalDate;

public class DateUtil {
    public static boolean isDateWithinRange(@Nonnull LocalDate givenDate, @Nonnull LocalDate startDate, @Nonnull LocalDate endDate) {
        return (givenDate.equals(startDate) || givenDate.isAfter(startDate))
                && (givenDate.isBefore(endDate) || givenDate.equals(endDate));
    }
}
