package string;

/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * 示例 2：
 *
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由小写英文组成
 * 1 <= k <= 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-string-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ReverseStr {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        String[] strs = s.split("");
return null;
    }

    public void exchange(String[] strs, int i, int j) {
        String temp = strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }
}