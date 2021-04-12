# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def pathSum(self, root: TreeNode, target: int):
        result, path = [], []
        def dfs(root, tar):
            if not root:
                return
            path.append(root.val)
            tar -= root.val
            if tar == 0 and not root.left and not root.right:
                result.append(list(path))
            dfs(root.left, tar)
            dfs(root.right, tar)
            path.pop()
        dfs(root, target)
        return result
