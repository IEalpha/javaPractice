package demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "abc";
        String str3 = null;
        /*public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));

        }*/
        System.out.println(Objects.equals(str1,str2));
        System.out.println(Objects.equals(str1,str3));

    }
}
