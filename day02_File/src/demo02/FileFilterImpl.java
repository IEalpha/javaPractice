package demo02;

import java.io.File;
import java.io.FileFilter;

/**
 * @author LiuHanxu
 * @Classname Demo01FileFilter
 * @Description TODO
 * @Date 2022/3/23 19:52
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.toString().contains("Demo");
    }
}
