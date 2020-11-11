## Integer to Roman

https://leetcode-cn.com/problems/integer-to-roman/

#### 解题思路

* 建立一个字典，key为数值，value为罗马数字
* 从大到小遍历keys，如果key小于num，num÷key，商为key对应value的罗马数字的数量，余数为新的num
* 将每次的`商*对应罗马数字`添加到`result`

#### 复杂度分析

* 时间复杂度：O(1)
* 空间复杂度：O(1)
