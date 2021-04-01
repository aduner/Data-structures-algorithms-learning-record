## Best Time to Buy and Sell Stock II

https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/


**股票买卖策略:**

- 单独交易日:设今天价格`p1`、明天价格`p2`，则今天买入、明天卖出可赚取金额p2一P1
  (负值代表亏损)。
- 连续上涨交易日:设此上涨交易日股票价格分别为`p1`,`p2.…pn`，则第一天买最后一天卖收益最大，即`pn - p1`;等价于每天都买卖，即`pn 一p1=(p2-pi)+(p3-p2)+...+(pn一pn-1)`
- 连续下降交易日:则不买卖收益最大，即不会亏钱。

**复杂度分析：**

- **时间复杂度 O\*(\*N\*) ：** 只需遍历一次`price`；
- **空间复杂度 O\*(1) ：** 变量使用常数额外空间。

