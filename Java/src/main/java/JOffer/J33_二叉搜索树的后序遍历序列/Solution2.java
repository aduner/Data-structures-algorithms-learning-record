package JOffer.J33_二叉搜索树的后序遍历序列;

/**
 * @author Aduner
 */
public class Solution2 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int left, int right) {
        if (left >= right)
            return true;
        int index = left;
        while (postorder[index] < postorder[right])
            index++;
        int r = index;
        while (postorder[index] > postorder[right])
            index++;
        return index == right && recur(postorder, left, r - 1) && recur(postorder, r, right - 1);
    }
}
