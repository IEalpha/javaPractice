package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo02CloseFlush
 * @Description TODO FileWriter.close() 和 FileWriter.flush() 的区别
               .flush()后可以继续write，而.close()之后流就关闭，不能使用，继续write会报java.io.IOException: Stream closed
 * @Date 2022/3/25 16:21
 */
public class Demo02CloseFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day02_File\\e.txt");
        fw.write("12345哈哈");
        fw.flush();
        fw.write(97);
        fw.close();
//        fw.write(98);
    }
}
