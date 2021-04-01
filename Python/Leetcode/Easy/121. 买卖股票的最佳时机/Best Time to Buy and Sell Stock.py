# Link: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
class Solution:
    def maxProfit(self, prices) -> int:
        minprice = float('inf')
        maxprofit = 0
        for price in prices:
            minprice = min(minprice, price)
            maxprofit = max(maxprofit, price - minprice)
        return maxprofit
