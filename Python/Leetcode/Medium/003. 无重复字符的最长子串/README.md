## Longest Substring Without Repeating Characters

https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/

#### 滑动窗口

时间复杂度：O(N)

空间复杂度：O(∣Σ∣)

#### 遍历

思路简单，代码易读

- 遍历，若不重复则记录该字符
- 如果遇到了已经存在的字符，则找到该字符所在位置，删除该字符，并保留该位置之后的子串，并把当前字符加入到最后，完成更新
- 如果是当前最长的，就替换掉之前存储的最长子串

时间复杂度：O(N^2)

空间复杂度：O(N)

