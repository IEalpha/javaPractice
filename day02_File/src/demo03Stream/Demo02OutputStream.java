package demo03Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo02SOutputStream
 * @Description TODO数据的追加写（续写）和换行
 * @Date 2022/3/24 15:08
 */
public class Demo02OutputStream {
    public static void main(String[] args) {
        show02();
    }

    /**
     * 续写
     */
    private static void show01() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day02_File\\c.txt", true);
            fos.write("你好".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 换行
     */
    private static void show02() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day02_File\\c.txt", true);
            fos.write("\r\n你好".getBytes());
            fos.write("\n你好".getBytes());
            fos.write("\r\r你好".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
