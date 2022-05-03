package demo01;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p);
    }
}
