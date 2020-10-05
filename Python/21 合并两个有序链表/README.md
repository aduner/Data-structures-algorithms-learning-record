## Merge Two Sorted Lists

Link: https://leetcode-cn.com/problems/merge-two-sorted-lists/

#### 思路：

- 判断 `l1` 或 `l2` 中是否有一个节点为空，如果存在，那么我们只需要把不为空的节点接到链表后面即可
- 对 `l1` 和 `l2` 重新赋值，使得 `l1` 指向比较小的那个节点对象
- 修改 `l1` 的 next 属性为递归函数返回值
- 返回 `l1`，注意：如果 `l1` 和 `l2` 同时为 None，此时递归停止返回 None

#### 复杂度分析

- 时间复杂度：O(n)
- 空间复杂度：O(n)