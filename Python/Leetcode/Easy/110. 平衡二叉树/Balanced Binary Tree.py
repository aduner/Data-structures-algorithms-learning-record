# Link: https://leetcode-cn.com/problems/balanced-binary-tree/

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    #自顶向下递归
    # def isBalanced(self, root: TreeNode) -> bool:
    #     def height(root: TreeNode):
    #         if not root:
    #             return 0
    #         return max(height(root.left), height(root.right)) + 1

    #     if not root:
    #         return True
    #     return abs(height(root.left) - height(root.right)) <= 1 and self.isBalanced(root.left) and self.isBalanced(root.right)

    # 自底向上递归
    def isBalanced(self, root: TreeNode) -> bool:
        def height(root: TreeNode) -> int:
            if not root:
                return 0
            leftHeight = height(root.left)
            rightHeight = height(root.right)
            if leftHeight == -1 or rightHeight == -1 or abs(leftHeight - rightHeight) > 1:
                return -1
            else:
                return max(leftHeight, rightHeight) + 1

        return height(root) != -1



