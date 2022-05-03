package demo01;

import java.io.File;
import java.io.IOException;

/**
 * @author LiuHanxu
 * @Classname Demo03File
 * @Description TODO File中的方法
 * @Date 2022/3/23 11:13
 */
public class Demo03File {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /**
     * list()和listFiles()方法
     * 分别返回遍历路径下的文件名和路径文件名
     */
    private static void show03() {
        File f1 = new File("E:\\workspace\\ideaWorkspace\\javaPractice");
        File[] files = f1.listFiles();
        String[] list = f1.list();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("该目录下无文件");
        }
        System.out.println("==============");
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("该目录下无文件");
        }
    }

    /**
     * mkdir()
     * 创建文件夹（单极）
     *
     * mkdirs()
     * 创建文件夹（单极多级都可）
     *
     * delete()
     * 删除文件和文件夹
     */
    private static void show02() {
        File f1 = new File("1.docx");
        System.out.println(f1.delete());
    }

    /**
     * createNewFile()
     * 如果文件不存在，创建一个新的空文件
     * 创建文件的路径必须存在
     */
    private static void show01() throws IOException {
        File f1 = new File("E:\\workspace\\ideaWorkspace\\javaPractice\\1.docx");
        if (!f1.exists()) {
            f1.createNewFile();
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件存在，创建失败");
        }
    }
}
