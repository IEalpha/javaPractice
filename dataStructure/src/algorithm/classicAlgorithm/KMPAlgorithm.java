package algorithm.classicAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "leeto";

        int i = new KMPAlgorithm().kmpAlgorithm(str1, str2);
        System.out.println(i);
    }

    public int kmpAlgorithm(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return -1;
        }
        int[] next = kmpNext(str2);
        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }

    public int[] kmpNext(String str) {
        int[] next = new int[str.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < str.length(); i++) {
            while (j > 0 && str.charAt(j) != str.charAt(i)) {
                j = next[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
