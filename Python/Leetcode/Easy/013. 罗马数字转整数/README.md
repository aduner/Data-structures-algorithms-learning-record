## Roman to Integer

Link: https://leetcode-cn.com/problems/roman-to-integer/

构造一个字典，其中`IV`、`XC` 这种值，我们赋值为原值减去前值

例如：

- `IV`: 4-I(1)=30
- `XC`: 90-X(10)=80

之后枚举遍历整个 string 的时候，判断当前位置和前一个位置的两个字符组成的字符串是否在字典内：

- 如果在就记录两个字符组成的字符串的值
- 不在就说明当前位置不存在小数字在前面的情况，直接记录当前位置字符对应值