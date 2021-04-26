class Solution:
    # 快速排序
    def quick_sort(self, nums, left, right):
        def partition(nums, left, right):
            pivot = left
            while left < right:
                while left < right and nums[right] >= nums[pivot]:
                    right -= 1
                while left < right and nums[left] <= nums[pivot]:
                    left += 1
                nums[left], nums[right] = nums[right], nums[left]
            nums[pivot], nums[left] = nums[left], nums[pivot]
            return left

        if left < right:  # 快速排序的递归终止条件
            index = partition(nums, left, right)
            self.quick_sort(nums, left, index-1)
            self.quick_sort(nums, index+1, right)

    def getLeastNumbers(self, arr, k):
        if k <= 0 or arr == []:
            return []
        if len(arr) <= k:
            return arr
        self.quick_sort(arr, 0, len(arr)-1)
        return arr[:k]
