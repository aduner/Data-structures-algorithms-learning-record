class Solution:
    # 快速排序
    def quick_sort(self, nums, left, right):
        def swap(nums, i, j):
            nums[i], nums[j] = nums[j], nums[i]

        def partition(nums, left, right):
            pivot = left
            while left < right:
                while left < right and nums[right] >= nums[pivot]:
                    right -= 1
                while left < right and nums[left] <= nums[pivot]:
                    left += 1
                swap(nums, left, right)
            swap(nums, pivot, left)
            return left

        if left < right:  # 快速排序的递归终止条件
            index = partition(nums, left, right)
            # print(nums)
            self.quick_sort(nums, left, index-1)
            self.quick_sort(nums, index+1, right)

    def getLeastNumbers(self, arr, k):
        if k <= 0 or arr == []:
            return []
        if len(arr) <= k:
            return arr
        self.quick_sort(arr, 0, len(arr)-1)
        return arr[:k]
