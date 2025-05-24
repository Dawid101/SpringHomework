package pl.coderslab.date;

import java.time.LocalDate;
import java.util.Date;

public class MainDate03 {
    public static void main(String[] args) {

    }

    public static boolean firstIsHigher(LocalDate date1, LocalDate date2){
      return date1.isAfter(date2);
    }

    public static boolean firstIsHigherDate(Date date1, Date date2){
        return date1.after(date2);
    }

}
