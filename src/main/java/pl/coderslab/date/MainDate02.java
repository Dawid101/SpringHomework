package pl.coderslab.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MainDate02 {
    public static void main(String[] args) {
        //1
        //Twój wiek w latach
        System.out.println("MÓJ WIEK W LATACH");
        LocalDate localDate = LocalDate.now();
        int myAge = localDate.getYear() - 1998;
        System.out.println(myAge);

        //2
        //Twój wiek w miesiącach
        System.out.println("MÓJ WIEK W MIESIĄCACH");
        System.out.println(myAge * 12);

        //3
        //Twój wiek w dniach
        System.out.println("MÓJ WIEK W DNIACH");
        LocalDate myBirthDay = LocalDate.of(1998,7,16);
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(myBirthDay,now);
        System.out.println(days);
    }
}
