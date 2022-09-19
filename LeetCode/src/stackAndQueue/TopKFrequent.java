package stackAndQueue;

import java.util.*;

/**
 * @author LiuHanxu
 * @Classname TopKFrequent
 * @Description TODO
 * @Date 2022/9/19 15:48
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/top-k-frequent-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((num1, num2) -> num2[1] - num1[1]);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            pq.add(new int[]{integerIntegerEntry.getKey(), integerIntegerEntry.getValue()});
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Objects.requireNonNull(pq.poll())[0];
        }
        return result;
    }

}
