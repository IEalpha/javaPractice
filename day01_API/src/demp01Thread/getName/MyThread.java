package demp01Thread.getName;

public class MyThread extends Thread{
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }
}
