package day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiuHanxu
 * @Classname FindTheLongestPalindrome
 * @Description 给你一个字符串 s，找到 s 中最长的回文子串。
 * @Date 2022/3/15 20:28
 */
public class FindTheLongestPalindrome {
    public static void main(String[] args) {
        String s = "bb";
        String result = longestPalindrome(s);
        System.out.println(result);
    }

    private static String longestPalindrome(String s) {
        List<String> list = new ArrayList<>();
        List<String> palindromeList = new ArrayList<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        int m = 0;
        int n = s.length() - 1;
        int temp = 0;
        int begin = 0;
        int end = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            m = i;
            n = s.length() - 1;
            while (m < n) {
                while (!list.get(m).equals(list.get(n))) {
                    n--;
                    begin = m;
                    end = n;
                    temp = n - 1;
                }
                while (m < n) {
                    if (list.get(m).equals(list.get(n))) {
                        m++;
                        n--;
                    } else {
                        n = temp - 1;
                        m = i;
                        break;
                    }
                }
                if (m >= n) {
                    palindromeList.clear();
                    for (int j = begin; j <= end; j++) {
                        palindromeList.add(list.get(j));
                    }
                    if (result.length() < palindromeList.size()) {
                        maxLength = palindromeList.size();
                        result = "";
                        for (int j = 0; j < palindromeList.size(); j++) {
                            result += palindromeList.get(j);
                        }
                    } else {
                        maxLength = result.length();
                    }
                    break;
                }
            }
        }
        if (result.equals("")) {
            result = list.get(0);
        }
        return result;
    }
}
