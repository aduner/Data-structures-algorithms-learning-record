# Link: https://leetcode-cn.com/problems/merge-sorted-array/
class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m == 0:
            nums1[:] = nums2[:]
        elif n == 0:
            return nums1
        else:
            a = 0
            while len(nums2) > 0:
                if nums1[a] <= nums2[0]: 
                    if a < m+n-len(nums2):
                        a += 1
                    else:
                        nums1[m+n-len(nums2):] = nums2[:]
                        break                    
                else:
                    nums1[a+1:m+n] = nums1[a:m+n-1]
                    nums1[a] = nums2.pop(0)