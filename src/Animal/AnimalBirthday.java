package Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalBirthday {
    static Date date;

    AnimalBirthday(Date date) {
        this.date = date;
    }

    public static Date parsDate(String birthday) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            date = simpleDateFormat.parse(birthday);
            return date;
        } catch (Exception e) {
            System.err.println("Некорректный формат даты!");
            return new Date();
        }
    }

    public static String getDate (Date date) {
        return (date.getYear()+1900) + "-" + (date.getMonth()+1) + "-" + (date.getDate());
    }

}
