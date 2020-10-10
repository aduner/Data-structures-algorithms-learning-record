## Longest Common Prefix

Link: https://leetcode-cn.com/problems/longest-common-prefix/

#### 常规方法：

- 取出最小的字符串和最大字符串
- 遍历判断公共前缀，返回最长结果

#### zip方法：

源：https://leetcode-cn.com/problems/longest-common-prefix/solution/shi-yong-zip-ji-xing-dai-ma-jian-dan-gao-ding-pyth/

- zip方法将全部string压缩合并
- 将压缩后的list转换为set，判断set的len是否等于1，不等1说明已经不同，break推出
- 每次将`len(set)==1`的set中的值取出合并，最后合并的结果即为最终答案