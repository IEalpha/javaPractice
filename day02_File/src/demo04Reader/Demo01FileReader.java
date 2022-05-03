package demo04Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo01Reader
 * @Description TODO Reader: 字符输入流，类似InputStream
 * @Date 2022/3/24 20:27
 */
public class Demo01FileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("day02_File\\c.txt");
            int len = 0;
            while ((len = fr.read()) != -1) {
                System.out.print((char) len);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
