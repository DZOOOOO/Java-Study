package jungsuck.standard3.ch10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.*;

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth()));
        p(today.with(firstDayOfMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(firstInMonth(TUESDAY)));
        p(today.with(lastInMonth(TUESDAY)));
        p(today.with(previous(TUESDAY)));
        p(today.with(previousOrSame(TUESDAY)));
        p(today.with(next(TUESDAY)));
        p(today.with(nextOrSame(TUESDAY)));
        p(today.with(dayOfWeekInMonth(4, TUESDAY)));
    }

    static void p(Object obj) {
        System.out.println(obj);
    }
}

class DayAfterTomorrow implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}