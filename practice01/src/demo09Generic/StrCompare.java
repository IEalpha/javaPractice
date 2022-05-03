package demo09Generic;

/**
 * @author LiuHanxu
 * @Classname StrCompare
 * @Description TODO
 * @Date 2022/4/22 16:08
 */
public class StrCompare {
    public static void main(String[] args) {
        int i = Integer.parseInt("214748364");
        StringBuilder sb = new StringBuilder("2147483648");
        sb.insert(0, '-');
        System.out.println(sb);
        long l = Long.parseLong(sb.toString());
        System.out.println(l);
        System.out.println(i);
    }
}
