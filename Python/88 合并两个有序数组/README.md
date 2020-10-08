## Merge Sorted Array

Link: https://leetcode-cn.com/problems/merge-sorted-array/

#### 解法:

- 首先排除两种特殊情况，`nums1`为0和`nums2`为0
- 遍历`nums1`与`nums2`中的元素比较，`nums2`中的大就插入，当`nums1`遍历结束后，直接将`nums2`并入`nums1`

