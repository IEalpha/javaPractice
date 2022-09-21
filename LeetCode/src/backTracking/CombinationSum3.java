package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
 *
 * 只使用数字1到9
 * 每个数字 最多使用一次 
 * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 解释:
 * 1 + 2 + 4 = 7
 * 没有其他符合的组合了。
 * 示例 2:
 *
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * 解释:
 * 1 + 2 + 6 = 9
 * 1 + 3 + 5 = 9
 * 2 + 3 + 4 = 9
 * 没有其他符合的组合了。
 * 示例 3:
 *
 * 输入: k = 4, n = 1
 * 输出: []
 * 解释: 不存在有效的组合。
 * 在[1,9]范围内使用4个不同的数字，我们可以得到的最小和是1+2+3+4 = 10，因为10 > 1，没有有效的组合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum3 {
    public static void main(String[] args) {
        System.out.println(new CombinationSum3().combinationSum3(2, 18));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        combine(k, n, 1, resultList, list);
        return resultList;
    }

    private void combine(int k, int n, int start, List<List<Integer>> resultList, LinkedList<Integer> list) {
        if (list.size() == k) {
            int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            if (sum == n) {
                resultList.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i <= 10 + k - list.size(); i++) {
            list.add(i);
            combine(k, n, i + 1, resultList, list);
            list.removeLast();
        }
    }
}
