# Link: https://leetcode-cn.com/problems/symmetric-tree/
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        def dfs(p, q):
            if p == None and q == None:
                return True
            elif p == None or q == None:
                return False
            elif p.val != q.val:
                return False
            else:
                return dfs(p.left, q.right) and dfs(p.right, q.left)
        if root == None:
            return True
        return dfs(root.left, root.right)
