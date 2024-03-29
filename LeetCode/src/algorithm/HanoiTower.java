package algorithm;

/**
 * @author LiuHanxu
 * @Classname HanoiTower
 * @Description TODO
 * @Date 2022/9/20 16:00
 */
public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(4, 'A', 'B', 'C');
    }

    public static void hanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            hanoiTower(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            hanoiTower(num - 1, b, a, c);
        }
    }
}
