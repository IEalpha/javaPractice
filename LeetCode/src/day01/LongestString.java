package day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestString {
    public static void main(String[] args) {
        String s = "dvdfd";
        lengthOfLongestSubstring(s);
    }

    private static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            List<String> charList = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (j == i) {
                    charList.add(String.valueOf(s.charAt(j)));
                    length++;
                } else {
                    if (charList.contains(String.valueOf(s.charAt(j)))) {
                        maxLength = Math.max(length, maxLength);
                        length = 0;
                        break;
                    } else {
                        charList.add(String.valueOf(s.charAt(j)));
                        length++;
                    }
                }
                if (j == s.length() - 1) {
                    maxLength = Math.max(length, maxLength);
                    length = 0;
                }
            }
        }
        return maxLength;
    }
}
