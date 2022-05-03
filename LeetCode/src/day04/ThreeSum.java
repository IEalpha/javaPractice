package day04;

import java.util.*;

/**
 * @author LiuHanxu
 * @Classname ThreeSum
 * @Description TODO 给你一个包含 n 个整数的数组  nums，判断  nums  中是否存在三个元素 a，b，c ，使得  a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *              TODO 注意：答案中不可以包含重复的三元组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/25 21:04
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        int length = nums.length;
        if (length < 3) {
            return resultList;
        } else if (length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                List<Integer> list = new ArrayList<>();
                for (int num : nums) {
                    list.add(num);
                }
                resultList.add(list);
            }
            return resultList;
        } else {
            Arrays.sort(nums);
            for (int first = 0; first < length - 2; first++) {
                if (first > 0) {
                    if (nums[first] == nums[first - 1]) {
                        continue;
                    }
                }
                int third = length - 1;
                int target = -nums[first];
                for (int second = first + 1; second < length - 1; second++) {
                    if (second > first + 1) {
                        if (nums[second] == nums[second - 1]) {
                            continue;
                        }
                    }
                    while (second < third && nums[second] + nums[third] > target) {
                        third--;
                    }
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        resultList.add(list);
                    }
                }
            }
        }
        return resultList;
    }
}
