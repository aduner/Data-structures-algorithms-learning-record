package JOffer.J33_二叉搜索树的后序遍历序列;

import java.util.*;

/**
 * @author Aduner
 */
public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        Deque<Integer> stack = new LinkedList<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root)
                return false;
            while (!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.push(postorder[i]);
        }
        return true;
    }
}

