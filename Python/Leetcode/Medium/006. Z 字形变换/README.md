## ZigZag Conversion

https://leetcode-cn.com/problems/zigzag-conversion/

#### 解题思路:

* 1行直接返回结果，n行根据行数建一个长度为n的list，各项为`''`
* 遍历s，按顺序填充，0->n n->0这样的填充字符，其实就是模拟z
* 最后将list中的字符串按顺序组合即可

#### 复杂度分析

* 时间复杂度：O(N)
* 空间复杂度：O(N)
