# Link: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
import collections


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def levelOrder(self, root: TreeNode):
        if root:
            queue = collections.deque()
            queue.append(root)
            res = []
            while queue:
                temp = []
                for _ in range(len(queue)):
                    node = queue.popleft()
                    temp.append(node.val)
                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)
                res.append(temp)
            return res
        else:
            return []

    #极简写法，其实思路和上面一样
    # def levelOrder(self, root):
    #     nodes = [(root,)]
    #     values = []
    #     while nodes:
    #         values.append([r.val for n in nodes for r in n if r])
    #         nodes = [(r.left, r.right) for n in nodes for r in n if r]
    #     return values[:-1]



