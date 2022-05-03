package demo09Generic;

/**
 * @author LiuHanxu
 * @Classname StringSplit
 * @Description TODO
 * @Date 2022/4/24 14:50
 */
public class StringSplit {
    public static void main(String[] args) {
        String s = "bo*o:an***d:foo*";
        String[] split = s.split("", 2);
//        System.out.println(split);
        String s1 = s.substring(3, s.length());
        System.out.println(s1);
        System.out.println(s);
        s = s.substring(0, 0);
        System.out.println(s);
    }
}
