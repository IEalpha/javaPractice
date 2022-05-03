package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo01FileWriter
 * @Description TODO 字符输出流，类似OutputStream
 * @Date 2022/3/25 16:13
 */
public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day02_File\\d.txt");
        fw.write("12345哈哈");
//        fw.flush();
        fw.close();
    }
}
