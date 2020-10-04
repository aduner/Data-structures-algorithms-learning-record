## Two Sum

Link: https://leetcode-cn.com/problems/two-sum/

#### 思路：

- 通过枚举的方式去构造一个字典，key为`nums`中的值，value为`nums`值的下标
- 每次循环先判断是否有和当前循环值的和满足target的key
  - 有返回key的value和当前下标
  - 没有的话用当前index和value分别添加，dict的value(index)和key(nums[index])

