## Palindrome Number

Link：https://leetcode-cn.com/problems/palindrome-number

- 方法1：利用Python切片的特性直接返回反转的字符串，比较是否一致即可，一行代码搞定
- 方法2：
  - 通过构造一个反向切割的数字来对比，无需转换字符串
  - 过程：12321举例
    - 某些特殊情况直接可以判断，例如小于0必定不是
    - x=12321 p=0 循环开始
    - x=1232 p=1
    - x=123 p=12
    - x=12 p=123 循环退出
    - 比较x与p **x=p or x=p//10** 即为回文数