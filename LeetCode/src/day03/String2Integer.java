package day03;

/**
 * @author LiuHanxu
 * @Classname String2Integer
 * @Description TODO 如下：
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 1.读入字符串并丢弃无用的前导空格
 * 2.检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 3.读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 4.将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 5.如果整数数超过 32 位有符号整数范围 [−2^31, 2^31 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2^31 的整数应该被固定为 −2^31 ，大于 2^31− 1 的整数应该被固定为 2^31− 1 。
 * 6.返回整数作为最终结果。
 * 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/22 10:35
 */
public class String2Integer {
    public static void main(String[] args) {
        String s = "  -0012a42";
        myAtoi2(s);
    }

    public static int myAtoi(String s) {
        int result = 0;
        int flag = 1;
        int startNum = 0;
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!String.valueOf(s.charAt(i)).equals(" ")) {
                startNum = i;
                break;
            }
        }
        if (Character.isDigit(s.charAt(startNum))) {
            for (int i = startNum; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                } else {
                    break;
                }
            }
        } else if (startNum == s.length() - 1) {
            return 0;
        } else if (s.charAt(startNum) == '-' && Character.isDigit(s.charAt(startNum + 1))) {
            flag = 0;
            for (int i = startNum + 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                } else {
                    break;
                }
            }
        } else if (s.charAt(startNum) == '+' && Character.isDigit(s.charAt(startNum + 1))) {
            for (int i = startNum + 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                } else {
                    break;
                }
            }
        } else {
            return 0;
        }
        String resStr = sb.toString();
        int index = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                index = i;
                break;
            }
            index = i;
        }
        resStr = sb.substring(index);
        if (flag == 0) {
            resStr = new StringBuilder(resStr).insert(0, '-').toString();
        }
        if (resStr.length() >= 12 && flag == 1) {
            return Integer.MAX_VALUE;
        }
        if (resStr.length() >= 12 && flag == 0) {
            return Integer.MIN_VALUE;
        }
        long l = Long.parseLong(resStr);
        if (l > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        } else {
            result = (int) l;
        }
        System.out.println(result);
        return result;
    }

    public static int myAtoi2(String s) {
        int start = -1;
        int end = s.length();
        int res = 0;
        int flag = 1;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        if (start == -1) {
            return 0;
        }
        if (s.charAt(start) == '+') {
            if (start >= s.length() - 1) {
                return 0;
            }
            start++;
            if (!Character.isDigit(s.charAt(start))) {
                return 0;
            }
        } else if (s.charAt(start) == '-') {
            if (start >= s.length() - 1) {
                return 0;
            }
            flag = -1;
            start++;
            if (!Character.isDigit(s.charAt(start))) {
                return 0;
            }
        } else if (!Character.isDigit(s.charAt(start))) {
            return 0;
        }
        for (int i = start; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                end = i;
                break;
            }
        }
        String numStr = s.substring(start, end);
        int newStart = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '0') {
                newStart = i;
                break;
            }
            newStart = numStr.length() - 1;
        }
        numStr = numStr.substring(newStart, numStr.length());
        if (numStr.length() > 13) {
            if (flag == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        long l = Long.parseLong(numStr) * flag;
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        res = (int) l;
        return res;
    }
}
