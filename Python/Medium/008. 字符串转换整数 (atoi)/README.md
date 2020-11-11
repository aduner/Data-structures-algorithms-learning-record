## String to Integer (atoi)

https://leetcode-cn.com/problems/string-to-integer-atoi/

#### 解题思路

* 正常思路
    - 用flag标记
        - 第一次遇到`-` `+` flag1
        - 第一次遇到数字或者符号 flag2
        - 第一次遇到字母 flag2
        - 根据flag的状态进行判断
    - 遍历`s`进行判断即可

* 正则匹配
    - 算是偷懒，直接把题意写进正则表达式里
    - 出去数字后直接判断输出即可
