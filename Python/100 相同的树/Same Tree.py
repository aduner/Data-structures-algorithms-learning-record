# Link: https://leetcode-cn.com/problems/same-tree/
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p == None and q == None:
            return True
        elif p == None or q == None:
            return False
        elif p.val != q.val:
            return False
        else:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)


t1 = TreeNode(12, left=TreeNode(None), right=TreeNode(-60))
t2 = TreeNode(12, left=TreeNode(None), right=TreeNode(72))
a = Solution()
print(a.isSameTree(t1, t2))
