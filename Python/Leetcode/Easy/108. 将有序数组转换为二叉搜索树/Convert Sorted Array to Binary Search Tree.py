# Link: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def sortedArrayToBST(self, nums):
        def make_tree(l, r):
            if l > r:
                return None
            m = (l+r)//2
            tree = TreeNode(nums[m])
            tree.left = make_tree(l, m-1)
            tree.right = make_tree(m+1, r)
            return tree
        return make_tree(0,len(nums)-1)