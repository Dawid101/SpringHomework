package pl.coderslab.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;

public class MainDate01 {
    public static void main(String[] args) {

        //1
        //ostatni dzień bieżącego miesiąca,
        System.out.println("ostatni dzień bieżącego miesiąca");
        YearMonth yearMonth = YearMonth.now();
        LocalDate lastDay = yearMonth.atEndOfMonth();
        System.out.println(lastDay.getDayOfWeek());

        //2
        //dzień, w który wypadnie następny piątek
        System.out.println("dzień, w który wypadnie następny piątek");
        LocalDate nowDate = LocalDate.now();
        for (int i = 1; i <= 7; i++) {
            LocalDate nextDay = nowDate.plus(Period.ofDays(i));
            if (nextDay.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                System.out.println(nextDay);
            }
        }

        //3
        //pierwszy dzień następnego miesiąca
        System.out.println("pierwszy dzień następnego miesiąca");
        int nextMonthAsInt = yearMonth.getMonthValue();
        LocalDate firstDay = LocalDate.of(2025,nextMonthAsInt + 1,1);
        System.out.println(firstDay.getDayOfWeek());
    }
}
