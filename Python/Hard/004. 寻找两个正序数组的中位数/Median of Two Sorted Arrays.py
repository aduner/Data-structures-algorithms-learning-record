# Link：https://leetcode-cn.com/problems/median-of-two-sorted-arrays/

class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        res = 0.0
        new_array = []
        m = len(nums1)
        n = len(nums2)
        length = m + n
        mid = int(length//2)
        i, j = 0, 0
        while len(new_array) - 1 < mid:
            if i < m and j < n:
                if nums1[i] < nums2[j]:
                    new_array.append(nums1[i])
                    i += 1
                    continue
                if nums1[i] >= nums2[j]:
                    new_array.append(nums2[j])
                    j += 1
                    continue
            if i == m and j < n:
                while j < n and len(new_array) - 1 < mid:
                    new_array.append(nums2[j])
                    j += 1
            if i < m and j == n:
                while i < m and len(new_array) - 1 < mid:
                    new_array.append(nums1[i])
                    i += 1
        if length & 1:
            res = new_array[mid]
        else:
            res = (new_array[mid-1] + new_array[mid])/2.0
        return res