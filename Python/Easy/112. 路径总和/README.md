## Path Sum

https://leetcode-cn.com/problems/path-sum/

**BFS广度优先搜索**:

记录从根节点到当前节点的路径和，以防止重复计算。

这样我们使用两个队列，分别存储将要遍历的节点，以及根节点到这些节点的路径和即可