package algorithm.test.linear;

import algorithm.linear.LinkList;

/**
 * @author LiuHanxu
 * @Classname LinkListTest
 * @Description TODO 单向链表测试
 * @Date 2022/5/4 16:58
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<Integer> links = new LinkList<>();
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
        links.clear();
        System.out.println(links.isEmpty());
        System.out.println("测试GitHub的clone是否成功");
    }
}
