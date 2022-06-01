package algorithm.uf;

/**
 * @author LiuHanxu
 * @Classname UF
 * @Description TODO 并查集树形优化
 * @Date 2022/6/1 15:23
 */
public class UF_Tree {
    private int[] eleAndGroup;
    private int count;//分组的个数

    public UF_Tree(int N) {
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
        while (true) {
            if (p == eleAndGroup[p]) {
                return p;
            }
            p = eleAndGroup[p];
        }
    }

    //判断p和q是否在同一个分组中
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    //把p元素所在的分组和q元素所在的分组合并
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        //让p所在的树的根节点的父节点为q所在树的根节点
        eleAndGroup[pRoot] = qRoot;
        this.count--;
    }
}
