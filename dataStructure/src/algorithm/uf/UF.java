package algorithm.uf;

/**
 * @author LiuHanxu
 * @Classname UF
 * @Description TODO 并查集
 * @Date 2022/6/1 15:23
 */
public class UF {
    private int[] eleAndGroup;
    private int count;//分组的个数

    public UF(int N) {
        this.eleAndGroup = new int[N];
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }
        this.count = N;
    }

    //分组的个数
    public int count() {
        return this.count;
    }

    /**
     * 元素p所在分组的标识符
     *
     * @param p
     * @return
     */
    public int find(int p) {
        return eleAndGroup[p];
    }

    //判断p和q是否在同一个分组中
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    //把p元素所在的分组和q元素所在的分组合并
    public void union(int p, int q) {
        if (connected(p, q)) {
            return;
        }
        int groupP = find(p);
        int groupQ = find(q);
        for (int i = 0; i < eleAndGroup.length; i++) {
            if (eleAndGroup[i] == groupP) {
                eleAndGroup[i] = groupQ;
            }
        }
        this.count--;
    }
}
