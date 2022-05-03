package day04;

/**
 * @author LiuHanxu
 * @Classname LogestCommonPrefix
 * @Description TODO 编写一个函数来查找字符串数组中的最长公共前缀。
 *              TODO 如果不存在公共前缀，返回空字符串 ""。
 * @Date 2022/4/25 20:17
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder("");
        int minLength = strs[0].length();
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        for (int i = 0; i < minLength; i++) {
            int commonCount = 1;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                    commonCount++;
                    if (commonCount == strs.length) {
                        sb.append(strs[j].charAt(i));
                    }
                } else {
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}
