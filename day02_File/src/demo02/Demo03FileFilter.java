package demo02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author LiuHanxu
 * @Classname Demo03FileFilter
 * @Description TODO
 * @Date 2022/3/23 19:54
 */
public class Demo03FileFilter {
    public static void main(String[] args) {
        File file = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\day02_File");
        getAllFiles(file);
        System.out.println("======================");
        getAllFilesContainsDemo(file);
        System.out.println("======================");
        getAllFilesContainsDemoWithLambda(file);
        System.out.println("======================");
        getAllFilesContainsDemoWithFilenameFilter(file);
    }

    private static void getAllFilesContainsDemoWithFilenameFilter(File file) {
        File[] files = file.listFiles((dir, name) -> new File(dir, name).isDirectory() || name.toString().contains("demo"));
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else if (file1.isDirectory()) {
                getAllFiles(file1);
            }
        }
    }

    /**
     * 直接使用匿名内部类实现接口FileFilter
     *
     * @param file
     */
    private static void getAllFilesContainsDemoWithLambda(File file) {
        File[] files = file.listFiles((pathname -> pathname.isDirectory() || pathname.toString().contains("Demo")));
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else if (file1.isDirectory()) {
                getAllFiles(file1);
            }
        }
    }

    /**
     * 直接使用匿名内部类实现接口FileFilter
     *
     * @param file
     */
    private static void getAllFilesContainsDemo(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.toString().contains("Demo");
            }
        });
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else if (file1.isDirectory()) {
                getAllFiles(file1);
            }
        }
    }

    /**
     * 利用FileFilter过滤器实现文件过滤
     */
    private static void getAllFiles(File file) {
        File[] files = file.listFiles(new FileFilterImpl());
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else if (file1.isDirectory()) {
                getAllFiles(file1);
            }
        }
    }


}
