# https://leetcode-cn.com/problems/path-sum/

import collections


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def hasPathSum(self, root: TreeNode, sum: int) -> bool:
        # BFS
        if not root:
            return False
        que_node = collections.deque([root])
        que_val = collections.deque([root.val])
        while que_node:
            now_node = que_node.popleft()
            now_val = que_val.popleft()
            if not now_node.left and not now_node.right:
                if now_val == sum:  # 找到
                    return True
                continue
            if now_node.left:
                que_node.append(now_node.left)
                que_val.append(now_val+now_node.left.val)
            if now_node.right:
                que_node.append(now_node.right)
                que_val.append(now_val+now_node.right.val)
        return False
