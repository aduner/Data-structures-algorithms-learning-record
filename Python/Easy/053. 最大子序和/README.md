## Maximum Subarray

Link: https://leetcode-cn.com/problems/maximum-subarray/

#### 暴力法

- 基本思路就是遍历一遍，用两个变量，一个记录最大的和，一个记录当前的和。最简单最好想的一种
- **时间复杂度**：**O(n**)


#### 分治法

- 最大子序和要么在左半边，要么在右半边，要么是穿过中间，对于左右边的序列，情况也是一样，因此可以用递归处理。中间部分的则可以直接计算出来。
- **时间复杂度**：**O(nlogn)**

