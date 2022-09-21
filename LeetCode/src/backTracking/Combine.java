package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * <p>
 * 你可以按 任何顺序 返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4, k = 2
 * 输出：
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * 示例 2：
 * <p>
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Combine {

    List<List<Integer>> resultList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(new Combine().combine(n, k));
    }

    public List<List<Integer>> combine(int n, int k) {
        combine(n, k, 1);
        return resultList;
    }

    public void combine(int n, int k, int start) {
        if (linkedList.size() == k) {
            resultList.add(new ArrayList<>(linkedList));
            return;
        }
        for (int i = start; i <= n + 1 + linkedList.size() - k; i++) {
            linkedList.add(i);
            combine(n, k, i + 1);
            linkedList.removeLast();
        }
    }
}
