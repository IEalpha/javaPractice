package algorithm.tree;


import algorithm.linear.Queue;

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

    //找出最小键
    public Key min() {
        return min(root).key;
    }

    //找出最小键所在的节点
    public Node min(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    //找到最大的键
    public Key max() {
        return max(root).key;
    }

    //找出最大键所在的节点
    public Node max(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    //使用前序遍历获得整个树中所有的Key
    public Queue<Key> preErgodic() {
        Queue<Key> keys = new Queue<>();
        preErgodic(root, keys);
        return keys;
    }

    //使用前序遍历，获取指定树的所有Key并放到keys中
    private void preErgodic(Node node, Queue<Key> keys) {
        if (node == null) {
            return;
        }
        keys.enqueue(node.key);
        if (node.left != null) {
            preErgodic(node.left, keys);
        }
        if (node.right != null) {
            preErgodic(node.right, keys);
        }
    }

    //使用中序遍历，获取整个树中的所有键
    public Queue<Key> midErgodic() {
        Queue<Key> keys = new Queue<>();
        midErgodic(root, keys);
        return keys;
    }

    //使用中序遍历，把指定树中的所有键放到keys中
    private void midErgodic(Node node, Queue<Key> keys) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            midErgodic(node.left, keys);
        }
        keys.enqueue(node.key);
        if (node.right != null) {
            midErgodic(node.right, keys);
        }
    }

    //后序遍历
    public Queue<Key> afterErgodic() {
        Queue<Key> keys = new Queue<>();
        afterErgodic(root, keys);
        return keys;
    }

    private void afterErgodic(Node node, Queue<Key> keys) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            afterErgodic(node.left, keys);
        }
        if (node.right != null) {
            afterErgodic(node.right, keys);
        }
        keys.enqueue(node.key);
    }

    //层序遍历整个树，获得所有节点的key
    public Queue<Key> layerErgodic() {
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();
        Node node = this.root;
        nodes.enqueue(node);
        while (!nodes.isEmpty()) {
            Node outNode = nodes.dequeue();
            keys.enqueue(outNode.key);
            if (outNode.left != null) {
                nodes.enqueue(outNode.left);
            }
            if (outNode.right != null) {
                nodes.enqueue(outNode.right);
            }
        }
        return keys;
    }

    //获取整个数的最大深度
    public int maxDepth() {
        return maxDepth(this.root);
    }

    //获取指定树的最大深度
    private int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = maxDepth(node.left);
        }
        if (node.right != null) {
            right = maxDepth(node.right);
        }
        return Math.max(left, right) + 1;
    }
}
