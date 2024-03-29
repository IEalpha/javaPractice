package hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 
 *  
 * 
 * 示例 1：
 * 
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * 
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(new Intersection().intersection(nums1, nums2));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, 0);
        }
        int[] result = new int[nums2.length];
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                result[j] = nums2[i];
                j++;
                map.remove(nums2[i]);
            }
        }
        return Arrays.copyOf(result, j);
    }
}
