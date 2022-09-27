package backTracking;

/**
 * @author LiuHanxu
 * @Classname LetterCombinations
 * @Description TODO
 * @Date 2022/9/23 16:42
 */

import java.util.*;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> resultList = new LinkedList<>();
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < digits.length(); i++) {
            list.add(String.valueOf(digits.charAt(i)));
        }
        StringBuilder sb = new StringBuilder();
        letterCombinations(list, map, resultList, digits.length(), 0,sb);
        return resultList;
    }

    public void letterCombinations(LinkedList<String> list, Map<String, String> map, List<String> resultList, int size, int start, StringBuilder sb) {
        if (sb.length() == size) {
            resultList.add(sb.toString());
            return;
        }
        for (int i = 0; i < map.get(list.get(start)).length(); i++) {
            sb.append(map.get(list.get(start)).charAt(i));
            letterCombinations(list, map, resultList, size, start + 1, sb);
            sb.delete(start, size);
        }
        
    }
}
