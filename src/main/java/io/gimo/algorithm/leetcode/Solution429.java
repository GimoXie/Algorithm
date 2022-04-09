package io.gimo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        Node cur;
        while (!queue.isEmpty()) {
            // 当前队列中的Node都是同一层的节点
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if ((cur = queue.poll()) != null) {
                    // Node出队时将子节点加入到队尾
                    queue.addAll(cur.children);
                    level.add(cur.val);
                }
            }
            ret.add(level);
        }
        return ret;
    }

}
