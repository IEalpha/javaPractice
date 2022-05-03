package demo03Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname Demo04FileCopyPractice
 * @Description TODO将一个文件复制到另一个位置
 * @Date 2022/3/24 20:07
 */
public class Demo04FileCopyPractice {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Military.jpg");
            FileOutputStream fos = new FileOutputStream("day02_File\\Military.jpg", true);
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
