package demp01Thread;

public class Demo01MainThread {

    /*
    单线程
     */

    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2 = new Person("旺财");
        p2.run();
    }
}
