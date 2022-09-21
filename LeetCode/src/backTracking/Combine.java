package backTracking;

/**
 * @author LiuHanxu
 * @Classname Combain
 * @Description TODO
 * @Date 2022/9/20 17:08
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 示例 2：
 *
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Combine {
    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> result = new Combine().combine(n, k);
        System.out.println(result);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        combine(n, k, 1, result, list);
        return result;
    }

    public void combine(int n, int k, int start, List<List<Integer>> result, LinkedList<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            combine(n, k, i + 1, result, list);
            list.removeLast();
        }
    }
}
