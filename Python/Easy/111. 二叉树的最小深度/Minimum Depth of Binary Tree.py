# https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if not root: 
            return 0
        if not root.left and not root.right: 	# 叶子节点
            return 1
        elif root.left and root.right:  # 左右子树均不为空
            return min(self.minDepth(root.left), self.minDepth(root.right)) + 1
        elif root.left:		# 左子树不为空 & 右子树为空
            return self.minDepth(root.left) + 1
        else:			# 左子树为空 & 右子树不为空
            return self.minDepth(root.right) + 1