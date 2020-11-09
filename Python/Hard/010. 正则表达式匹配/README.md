## Regular Expression Matching

https://leetcode-cn.com/problems/regular-expression-matching/

#### 解题思路

* 先判断s和p的第一个字符是否匹配
* 处理p[1]为*号的情况：匹配0个或多个字符
* 处理. 号的情况：匹配一个字符
* 装饰符实现记忆化搜索，等价于Top-Down动态规划

时间复杂度 O(n²)
