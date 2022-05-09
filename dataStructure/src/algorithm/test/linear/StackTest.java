package algorithm.test.linear;

import algorithm.linear.Stack;

/**
 * @author LiuHanxu
 * @Classname StackTest
 * @Description TODO 栈测试
 * @Date 2022/5/9 20:26
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (Integer integer : stack) {
            System.out.println(integer);
        }
        System.out.println("====================");

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
