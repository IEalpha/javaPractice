package demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    private static void demo02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse("2021-07-19 10:31:26");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void demo01() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String dateFormat = format.format(date);
        System.out.println("date = " + date);
        System.out.println("dateFormat = " + dateFormat);
    }
}
