package day04;

import java.util.Arrays;

/**
 * @author LiuHanxu
 * @Classname ThreeSumClosest
 * @Description TODO 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 *              TODO 返回这三个数的和。
 *              TODO 假定每组输入只存在恰好一个解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2022/4/26 20:57
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
//        int result = 0;
//        int length = nums.length;
//        if (nums.length == 3) {
//            return nums[0] + nums[1] + nums[2];
//        }
//        Arrays.sort(nums);
//        for (int first = 0; first < length - 2; first++) {
//            if (first > 0) {
//                if (nums[first] == nums[first - 1]) {
//                    continue;
//                }
//            }
//            int third = length - 1;
//            for (int second = first + 1; second < length - 1; second++) {
//                if (second > first + 1) {
//                    if (nums[second] == nums[second - 1]) {
//                        continue;
//                    }
//                }
//
//            }
//        }
        return 0;
    }
}
