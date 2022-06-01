package algorithm.uf;

/**
 * @author LiuHanxu
 * @Classname UF
 * @Description TODO 并查集树形优化的路径压缩优化
 * @Date 2022/6/1 15:23
 */
public class UF_Tree_Weighted {
    private int[] eleAndGroup;
    private int[] sz;//存储每一个根节点对应树保存的结点树
    private int count;//分组的个数

    public UF_Tree_Weighted(int N) {
        this.eleAndGroup = new int[N];
        this.sz = new int[N];
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
            sz[i] = 1;
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
        if (sz[pRoot] < sz[qRoot]) {
            eleAndGroup[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            eleAndGroup[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        this.count--;
    }
}
