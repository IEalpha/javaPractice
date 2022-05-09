package algorithm.test.linear;

import algorithm.linear.Stack;

/**
 * @author LiuHanxu
 * @Classname BracketsMatchTest
 * @Description TODO 栈解决案例：左右括号匹配问题
 * @Date 2022/5/9 20:37
 */
public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "())(上海(长安)())";
        System.out.println(isMatch(str));
    }

    private static boolean isMatch(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push("(");
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
