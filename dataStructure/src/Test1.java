import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author LiuHanxu
 * @Classname Test1
 * @Description TODO str1是否包含str2，包含返回第一次出现的位置，不包含返回-1
 * @Date 2022/4/27 15:32
 */
public class Test1 {
    public static void main(String[] args) {
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(1);
//        set.add(2);
//        int i = set.iterator().next();
//        System.out.println(i);
        sortedSquares(new int[]{-4, -1, 0, 3, 10});
    }

    private static void sum1() {
        int sum = 0;
        int n = 1000000;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void sum2() {
        int sum = 0;
        int n = 1000000;
        sum = (n + 1) * n / 2;
        System.out.println(sum);
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0;i < nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }
        sort(nums);
        return nums;
    }

    public static void sort(int[] nums) {
        int maxIndex = 0;
        for(int i = nums.length - 1;i > 0;i--) {
            for(int j = 0;j <= i;j++) {
                if(nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            exchange(nums, maxIndex, i);
        }
    }

    public static void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
