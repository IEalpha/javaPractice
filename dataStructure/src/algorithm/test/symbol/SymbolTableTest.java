package algorithm.test.symbol;

import algorithm.symbol.SymbolTable;

/**
 * @author LiuHanxu
 * @Classname SymbolTest
 * @Description TODO 测试符号表SymbolTable
 * @Date 2022/5/16 15:25
 */
public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();
        symbolTable.put(1, "1");
        symbolTable.put(2, "2");
        symbolTable.put(3, "3");
        int size = symbolTable.size();
        symbolTable.put(2, "22");
        String s = symbolTable.get(2);
        String delete = symbolTable.delete(2);
        size = symbolTable.size();
        System.out.println(1);
    }
}
