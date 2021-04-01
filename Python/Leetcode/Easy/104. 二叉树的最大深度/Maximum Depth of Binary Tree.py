# Link: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
from collections import deque
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    # dfs
    def maxDepth(self, root: TreeNode) -> int:
        if root:
            return max(self.maxDepth(root.left), self.maxDepth(root.right))+1
        else:
            return 0
    
    # bfs
    # def maxDepth(self, root: TreeNode) -> int:
        # if not root:
        #     return 0
        # depth = 0
        # queue = deque([root])
        # while queue:
        #     depth += 1
        #     next_layer = []
        #     while queue:
        #         node = queue.popleft()
        #         if node.left:
        #             next_layer.append(node.left)
        #         if node.right:
        #             next_layer.append(node.right)
        #     queue = deque(next_layer)
        # return depth