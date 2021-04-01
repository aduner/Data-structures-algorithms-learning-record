# Link: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution:
    # 贪心算法
    def maxProfit(self, prices) -> int:
        profit = 0
        for i in range(1, len(prices)):
            tmp = prices[i] - prices[i - 1]
            if tmp > 0: 
                profit += tmp
        return profit
