package algorithm.test.uf;

import algorithm.uf.UF_Tree_Weighted;

import java.util.Scanner;

/**
 * @author LiuHanxu
 * @Classname RoadConnect
 * @Description TODO 并查集案例
 * @Date 2022/6/1 16:52
 */
public class RoadConnect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总共有多少个城市");
        int sum = sc.nextInt();
        UF_Tree_Weighted uf = new UF_Tree_Weighted(sum);
        while (true) {
            System.out.println("请输入已经联通的城市代号：，若已全部输入则输入-1");
            int road1 = sc.nextInt();
            if (road1 == -1) {
                break;
            }
            int road2 = sc.nextInt();
            uf.union(road1, road2);
        }
        System.out.println("还需要修建" + (uf.count() - 1) + "条道路");
    }
}
