package day01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiddleNum {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 6, 60};
        int[] nums2 = {4, 5, 7, 10, 88};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            numbers.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            numbers.add(nums2[i]);
        }
        numbers.sort(Comparator.naturalOrder());
        if ((nums1.length + nums2.length) % 2 == 0) {
            return ((double) numbers.get((nums1.length + nums2.length) / 2) + (double) numbers.get(((nums1.length + nums2.length) / 2) - 1)) / 2;
        } else {
            return numbers.get((nums1.length + nums2.length) / 2);
        }

    }
}
