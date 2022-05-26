package algorithm.test.symbol;

import algorithm.symbol.OrderSymbolTable;

/**
 * @author LiuHanxu
 * @Classname OrderSymbolTableTest
 * @Description TODO
 * @Date 2022/5/16 16:35
 */
public class OrderSymbolTableTest {
    public static void main(String[] args) {
        OrderSymbolTable<Integer, Integer> orderSymbolTable = new OrderSymbolTable<>();
        orderSymbolTable.put(3, 3);
        orderSymbolTable.put(5, 5);
        orderSymbolTable.put(1, 1);
        orderSymbolTable.put(4, 4);

    }
}
