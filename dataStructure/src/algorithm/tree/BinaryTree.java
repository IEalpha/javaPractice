package algorithm.tree;


/**
 * @author LiuHanxu
 * @Classname BinaryTree
 * @Description TODO 查找二叉树
 * @Date 2022/5/17 10:17
 */
public class BinaryTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public int size() {
        return this.N;
    }

    public void put(Key key, Value value) {
        root = put(this.root, key, value);
    }

    //往指定的某个子树x中插入元素
    public Node put(Node x, Key key, Value value) {
        //x为空
        if (x == null) {
            this.N++;
            return new Node(key, value, null, null);
        }
        //x不空
        int compare = key.compareTo(x.key);
        if (compare > 0) {
            x.right = put(x.right, key, value);
        } else if (compare < 0) {
            x.left = put(x.left, key, value);
        } else {
            x.value = value;
        }
        return x;
    }

    public Value get(Key key) {
        return get(this.root, key);
    }

    public Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int compare = key.compareTo(x.key);
        if (compare > 0) {
            return get(x.right, key);
        } else if (compare < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
    }

    public void delete(Key key) {
        delete(root, key);
    }

    public Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int compare = key.compareTo(x.key);
        if (compare > 0) {
            x.right = delete(x.right, key);
        } else if (compare < 0) {
            x.left = delete(x.left, key);
        } else {
            if (x.right == null) {
                this.N--;
                return x.left;
            }
            if (x.left == null) {
                this.N--;
                return x.right;
            }
            Node minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            Node node = x.right;
            while (node.left != null) {
                if (node.left.left == null) {
                    node.left = null;
                } else {
                    node = node.left;
                }
            }
            minNode.left = x.left;
            minNode.right = x.right;
            x = minNode;
            this.N--;
        }
        return x;
    }
}
