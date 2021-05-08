# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution2:
    # 递归
    def isSubStructure(self, A: TreeNode, B: TreeNode) -> bool:
        def recur(A, B):
            if not B:
                return True
            if not A or A.val != B.val:
                return False
            return recur(A.left, B.left) and recur(A.right, B.right)

        return bool(A and B) and (recur(A, B) or self.isSubStructure(A.left, B) or self.isSubStructure(A.right, B))


class Solution:
    # 迭代
    def isSubStructure(self, A: TreeNode, B: TreeNode) -> bool:
        if B == None:
            return False
        if A.val == None:
            return False
        q = []
        q.append(A)
        while q:
            temp = q.pop(0)
            if temp.val == B.val:
                if self.include(temp, B):
                    return True
            if temp.left != None:
                q.append(temp.left)
            if temp.right != None:
                q.append(temp.right)
        return False

    def include(self, A, B):
        q_a = [A]
        q_b = [B]
        while q_b and q_a:
            temp_a = q_a.pop(0)
            temp_b = q_b.pop(0)
            if temp_b.val != temp_a.val:
                return False
            if temp_b.left != None:
                q_b.append(temp_b.left)
                if temp_a.left == None:
                    return False
                else:
                    q_a.append(temp_a.left)
            if temp_b.right != None:
                q_b.append(temp_b.right)
                if temp_a.right == None:
                    return False
                else:
                    q_a.append(temp_a.right)
        if q_b:
            return False
        return True
