package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHanxu
 * @Classname IntToRoman
 * @Description TODO
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给你一个整数，将其转为罗马数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/25 16:06
 */
public class IntToRoman {
    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman2(num));
    }

    public static String intToRoman(int num) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = 1; i < 5; i++) {
            temp = (int) (num % Math.pow(10, i));
            list.add(temp);
            num -= temp;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            StringBuilder tempString = new StringBuilder();
            if (integer != 0) {
                if (integer > 0 && integer < 10) {
                    if (integer < 4) {
                        tempString.append("I".repeat(integer));
                    } else if (integer == 4) {
                        tempString.append("IV");
                    } else if (integer < 9) {
                        tempString.append("V");
                        tempString.append("I".repeat(integer - 5));
                    } else {
                        tempString.append("IX");
                    }
                } else if (integer >= 10 && integer < 100) {
                    if (integer / 10 < 4) {
                        tempString.append("X".repeat(integer / 10));
                    } else if (integer / 10 == 4) {
                        tempString.append("XL");
                    } else if (integer / 10 < 9) {
                        tempString.append("L");
                        tempString.append("X".repeat(integer / 10 - 5));
                    } else {
                        tempString.append("XC");
                    }
                } else if (integer >= 100 && integer < 1000) {
                    if (integer / 100 < 4) {
                        tempString.append("C".repeat(integer / 100));
                    } else if (integer / 100 == 4) {
                        tempString.append("CD");
                    } else if (integer / 100 < 9) {
                        tempString.append("D");
                        tempString.append("C".repeat(integer / 100 - 5));
                    } else {
                        tempString.append("CM");
                    }
                } else if (integer >= 1000 && integer < 4000) {
                    tempString.append("M".repeat(integer / 1000));
                }
                sb.insert(0, tempString);
            }
        }
        return sb.toString();
    }
    public static String intToRoman2(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuffer roman = new StringBuffer();
        roman.append(thousands[num / 1000]);
        roman.append(hundreds[num % 1000 / 100]);
        roman.append(tens[num % 100 / 10]);
        roman.append(ones[num % 10]);
        return roman.toString();
    }
}
