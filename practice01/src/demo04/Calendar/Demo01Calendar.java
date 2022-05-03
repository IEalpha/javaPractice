package demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
        System.out.println(calendar);
    }
}
