package JOffer.J26_树的子结构;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Aduner
 */
public class Solution2 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(A);
        while (!queue.isEmpty()) {
            TreeNode qA = queue.poll();
            if (qA.val == B.val) {
                if (include(qA, B)) {
                    return true;
                }
            }
            if (qA.left != null) {
                queue.offer(qA.left);
            }
            if (qA.right != null) {
                queue.offer(qA.right);
            }
        }
        return false;
    }

    public boolean include(TreeNode A, TreeNode B) {
        Queue<TreeNode> queueA = new LinkedList();
        Queue<TreeNode> queueB = new LinkedList();
        queueA.offer(A);
        queueB.offer(B);
        while(!queueB.isEmpty()){
            TreeNode nodeA = queueA.poll();
            TreeNode nodeB = queueB.poll();
            if(nodeA == null || nodeA.val != nodeB.val){
                return false;
            }
            if(nodeB.left != null){
                queueA.offer(nodeA.left);
                queueB.offer(nodeB.left);
            }
            if(nodeB.right != null){
                queueA.offer(nodeA.right);
                queueB.offer(nodeB.right);
            }
        }
        return true;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
