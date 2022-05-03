package demo03Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname Demo01OutputStream
 * @Description TODO 输出流 java.io.OutputStream:所有字节输出流的超类，定义共性方法
 * @Date 2022/3/24 10:50
 */
public class Demo01OutputStream {
    public static void main(String[] args) {
        //传入一个int类型
//        File file = new File("day02_File\\a.txt");
//        try {
//            FileOutputStream fos = new FileOutputStream("day02_File\\a.txt");
//            fos.write(97);
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //传入字节数组
//        try {
//            FileOutputStream fos1 = new FileOutputStream(new File("day02_File\\b.txt"));
//            byte[] bytes = {65, 66, 67, 68, 69};
//            fos1.write(bytes, 1, 2);
//            fos1.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileOutputStream fos = new FileOutputStream("day02_File\\c.txt");
            byte[] bytes = "你好".getBytes(StandardCharsets.UTF_8);
            System.out.println(Arrays.toString(bytes));
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
