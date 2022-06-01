package algorithm.test.uf;

import algorithm.uf.UF_Tree;
import algorithm.uf.UF_Tree_Weighted;

import java.util.Scanner;

/**
 * @author LiuHanxu
 * @Classname UFTest
 * @Description TODO 并查集测试
 * @Date 2022/6/1 15:40
 */
public class UFTreeWeightedTest {
    public static void main(String[] args) {
        UF_Tree_Weighted uf = new UF_Tree_Weighted(5);
        System.out.println(uf.count());
        System.out.println("==================");
        Scanner sc = new Scanner(System.in);
        while (uf.count() > 1) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (uf.connected(p,q)) {
                System.out.println("存在");
                System.out.println("=============");
                continue;
            }
            uf.union(p, q);
            System.out.println(uf.count());
            System.out.println("==============");
        }
    }
}
