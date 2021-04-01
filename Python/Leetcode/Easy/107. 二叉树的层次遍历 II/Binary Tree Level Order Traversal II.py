# Link: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
import collections

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def levelOrderBottom(self, root: TreeNode):
        if root:
            res=[]
            queue = collections.deque()
            queue.append(root)
            while queue:
                temp=[]
                for _ in range(len(queue)):
                    node=queue.popleft()
                    temp.append(node.val)
                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)
                res.append(temp)
            return res[::-1]
        else:
            return []