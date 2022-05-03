package demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入出生年月日，格式yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();
        try {

            Date birth = sdf.parse(birthday);
            Long time1 = now.getTime();
            Long time2 = birth.getTime();
            Long time = time1 - time2;
            Long day = time/3600000/24;
            System.out.println(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
