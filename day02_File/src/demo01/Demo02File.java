package demo01;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author LiuHanxu
 * @Classname Demo02File
 * @Description File类的构造方法
 * @Date 2022/3/22 16:58
 */
public class Demo02File {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    /**
     * File.length：获得文件大小，单位为字节
     * 如果路径不存在，则返回0
     * 如果路径为文件夹，则返回0或者为该文件夹划分的盘符，即4096
     */
    private static void show03() {
        File file1 = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\day01_API");
        File file3 = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\0.txt");
        File file2 = new File("javaPractice.iml");
        System.out.println(file1.length());
        System.out.println(file2.length());
        System.out.println(file3.length());
    }

    /**
     * getName方法:获得文件名
     */
    private static void show02() {
        File file1 = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\javaPractice.iml");
        File file2 = new File("javaPractice.iml");
        System.out.println(file1.getName());
        System.out.println(file2.getName());
    }

    /**
     * 获得绝对路径
     */
    private static void show01() {
        File file1 = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\javaPractice.iml");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println("====================");
        File file2 = new File("javaPractice.iml");
        String absolutePath2 = file2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}
