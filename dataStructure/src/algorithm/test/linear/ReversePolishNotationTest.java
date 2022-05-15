package algorithm.test.linear;

import algorithm.linear.Stack;

/**
 * @author LiuHanxu
 * @Classname ReversePolishNotationTest
 * @Description TODO 利用栈求逆波兰表达式
 * @Date 2022/5/11 15:59
 */
public class ReversePolishNotationTest {
    public static void main(String[] args) {
        //3*(17-15)+18/6
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = calculate(notation);
        System.out.println(result);
    }

    private static int calculate(String[] notation) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < notation.length; i++) {
            Integer b = 0;
            Integer a = 0;
            switch (notation[i]) {
                case "+":
                    b = Integer.valueOf(stack.pop());
                    a = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a + b));
                    break;
                case "-":
                    b = Integer.valueOf(stack.pop());
                    a = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a - b));
                    break;
                case "*":
                    b = Integer.valueOf(stack.pop());
                    a = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a * b));
                    break;
                case "/":
                    b = Integer.valueOf(stack.pop());
                    a = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a / b));
                    break;
                default:
                    stack.push(String.valueOf(notation[i]));
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
