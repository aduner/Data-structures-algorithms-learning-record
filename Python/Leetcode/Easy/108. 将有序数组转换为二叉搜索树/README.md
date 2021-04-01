## Convert Sorted Array to Binary Search Tree

https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/

**就是构造平衡二叉搜索树，因为已经排序，所以只需要构建平衡二叉树即可**

**时间复杂度：O(n)，其中 n 是数组的长度。每个数字只访问一次。**

**空间复杂度：O(logn)，其中 n 是数组的长度。空间复杂度不考虑返回值，因此空间复杂度主要取决于递归栈的深度，递归栈的深度是 O(logn)**

