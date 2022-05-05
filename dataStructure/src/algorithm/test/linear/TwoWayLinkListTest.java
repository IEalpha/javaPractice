package algorithm.test.linear;

import algorithm.linear.LinkList;
import algorithm.linear.TwoWayLinkList;

/**
 * @author LiuHanxu
 * @Classname LinkListTest
 * @Description TODO 单向链表测试
 * @Date 2022/5/4 16:58
 */
public class TwoWayLinkListTest {
    public static void main(String[] args) {
        TwoWayLinkList<Integer> links = new TwoWayLinkList<>();
        links.insert(1);
        links.insert(2);
        links.insert(3);
        links.insert(4);
        for (Integer link : links) {
            System.out.println(link);
        }
        System.out.println(links.isEmpty());
        System.out.println("=================");
        links.insert(2, 5);
        links.insert(9);
        int length = links.length();
        int i = links.indexOf(3);
        Integer integer = links.get(2);
        Integer remove = links.remove(2);
        Integer first = links.getFirst();
        Integer last = links.getLast();
        links.clear();
        System.out.println(links.isEmpty());
    }
}
