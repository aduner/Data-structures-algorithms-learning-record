## Valid Parentheses

Link: https://leetcode-cn.com/problems/valid-parentheses/

#### 很容易想到用栈的方式解题：

- 建立一个`dict`，`key`为右括号，`value`为左括号
- 遍历`s`，如果`i`为`dict`中的`key`，判断栈顶元素是否匹配：
  - 匹配弹出栈顶元素
  - 不匹配返回False
- 最后如果**栈空**即为**True**，**非空**即为**False**

**复杂度分析**

- 时间复杂度：O(N)，遍历了一遍字符串
- 空间复杂度：O(N)，最坏情况下，假如输入是 `(((`，栈的大小是`s`的长度