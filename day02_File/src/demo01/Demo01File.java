package demo01;

import java.io.File;

/**
 * @author LiuHanxu
 * @Classname Demo01File
 * @Description TODO
 * @Date 2022/3/22 16:47
 */
public class Demo01File {
    /*
     File常用单词：
        file
        directory
        path
     */

    public static void main(String[] args) {
        //路径分隔符,Windows下为分号，Linux下为冒号
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        //分隔符，Windows下为\，Linux下为/
        String separator = File.separator;
        System.out.println(separator);
    }

}
