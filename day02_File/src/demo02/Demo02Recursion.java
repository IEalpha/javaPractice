package demo02;

import java.io.File;

/**
 * @author LiuHanxu
 * @Classname Demo02Recursion
 * @Description TODO
 * @Date 2022/3/23 16:45
 */
public class Demo02Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\day02_File");
        getAllFiles(file);
        getAllFilesEndWithJava(file);
    }

    /**
     * 遍历路径下的.java文件
     * @param file
     */
    private static void getAllFilesEndWithJava(File file) {
        File[] files = file.listFiles();
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile() && file1.toString().endsWith(".java")) {
                System.out.println(file1);
            } else if (file1.isDirectory()){
                getAllFiles(file1);
            }
        }
    }

    /**
     * 遍历路径下所有文件
     * @param file
     */
    private static void getAllFiles(File file) {
        File[] files = file.listFiles();
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else if (file1.isDirectory()){
                getAllFiles(file1);
            }
        }
    }
}
