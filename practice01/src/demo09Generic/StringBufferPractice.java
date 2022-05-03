package demo09Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname StringBufferPractice
 * @Description TODO
 * @Date 2022/4/19 21:10
 */
public class StringBufferPractice {
    public static void main(String[] args) {

        List<String> dimTableList = new ArrayList<>();
        List<String> levelCodeList = new ArrayList<>();
        List<String> contentNameList = new ArrayList<>();
        dimTableList.add("DATA_CUBE.DESIGN_QUALITY.DIM_MATERIAL");
        dimTableList.add("DATA_CUBE.DESIGN_QUALITY.DIM_REGION");
        levelCodeList.add("WZZL");
        levelCodeList.add("ZYQY");
        contentNameList.add("板材类");
        contentNameList.add("区域1");

        StringBuilder tableCondition1 = new StringBuilder("DATA_CUBE.DESIGN_QUALITY.DESIGN_MODIFY_CUBE cube");
        for (String dimTable : dimTableList) {
            tableCondition1.append(", ").append(dimTable);
        }
        StringBuilder searchCondition1 = new StringBuilder();
        for (int i = 0; i < dimTableList.size(); i++) {
            searchCondition1.append("(cube.").append(dimTableList.get(i).substring(dimTableList.get(i).indexOf(".DIM_") + 5));
            searchCondition1.append(" in (select SERCH_KEY from ").append(dimTableList.get(i)).append(" where ").append(levelCodeList.get(i));
            searchCondition1.append("=N'").append(contentNameList.get(i)).append("'))");
            if (i < dimTableList.size() - 1) {
                searchCondition1.append(" and ");
            }
        }
        String tableCondition = tableCondition1.toString();
        String searchCondition = searchCondition1.toString();
        System.out.println(tableCondition);
        System.out.println(searchCondition);
    }
}
