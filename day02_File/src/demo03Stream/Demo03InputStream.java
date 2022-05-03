package demo03Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo03InputStream
 * @Description TODO
 * @Date 2022/3/24 15:15
 */
public class Demo03InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("day02_File\\c.txt");
            int read = 0;
            while ((read = fis.read()) != -1) {
                System.out.print((char) read);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
