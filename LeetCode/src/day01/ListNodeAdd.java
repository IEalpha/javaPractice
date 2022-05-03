package day01;

public class ListNodeAdd {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
//        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
//        ListNode l2 = new ListNode(9);
        ListNode l1 = new ListNode(0, new ListNode(8, new ListNode(6, new ListNode(5, new ListNode(6, new ListNode(8, new ListNode(3, new ListNode(5, new ListNode(7)))))))));
        ListNode l2 = new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(8, new ListNode(5, new ListNode(8, new ListNode(9, new ListNode(7)))))))));
        addTwoNumbers(l1, l2);
    }

    /**
     * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
     * <p>
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * <p>
     * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        long x1 = 0;
        long x2 = 0;
        int length1 = 0;
        int length2 = 0;
        if ((l1 == null)) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            while (temp1.next != null) {
                length1++;
                temp1 = temp1.next;
            }
            while (temp2.next != null) {
                length2++;
                temp2 = temp2.next;
            }
            int length = Math.max(length1 + 2, length2 + 2);
            int[] array1 = new int[length];
            int[] array2 = new int[length];
            int i1 = length - 1;
            while (l1.next != null) {
                array1[i1] = l1.val;
                l1 = l1.next;
                i1--;
            }
            array1[i1] = l1.val;
            array1[i1 - 1] = 0;
            int i2 = length - 1;
            while (l2.next != null) {
                array2[i2] = l2.val;
                l2 = l2.next;
                i2--;
            }
            array2[i2] = l2.val;
            array2[i2 - 1] = 0;
            int[] array3 = new int[length];
            int borrow = 0;
            for (int i = 0; i < length; i++) {
                if (array1[length - 1 - i] + array2[length - 1 - i] + borrow >= 10) {
                    array3[length - 1 - i] = array1[length - 1 - i] + array2[length - 1 - i] - 10 + borrow;
                    borrow = 1;
                } else {
                    array3[length - 1 - i] = array1[length - 1 - i] + array2[length - 1 - i] + borrow;
                    borrow = 0;
                }
            }
            ListNode result = new ListNode();
            if (array3[0] != 0) {
                result = new ListNode(array3[0]);
                if (length >= 2) {
                    int i = length - 2;
                    while (i >= 0) {
                        result = new ListNode(array3[length - 1 - i], result);
                        i--;
                    }
                }
            } else {
                result = new ListNode(array3[1]);
                if (length >= 2) {
                    int i = length - 2;
                    while (i >= 1) {
                        result = new ListNode(array3[length - i], result);
                        i--;
                    }
                }
            }
            return result;
        }
    }


}
