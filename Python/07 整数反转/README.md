# Reverse Integer

Link: https://leetcode-cn.com/problems/reverse-integer/

- 先判断x的正负，设置一个flag用来最后纠正±
- 然后将x转换为str，循环构造一个反转的x
- *flag调整±
- 判断是否溢出，然后输出即可