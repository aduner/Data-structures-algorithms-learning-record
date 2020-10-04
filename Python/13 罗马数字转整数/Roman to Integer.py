# Link: https://leetcode-cn.com/problems/roman-to-integer/
class Solution:
    def romanToInt(self, s: str) -> int:
        d = {'I': 1, 'IV': 3, 'V': 5, 'IX': 8, 'X': 10, 'XL': 30, 'L': 50,
             'XC': 80, 'C': 100, 'CD': 300, 'D': 500, 'CM': 800, 'M': 1000}
        sum = 0
        for index, value in enumerate(s):
            temp = d.get(s[max(index-1, 0):index+1])
            if temp != None:
                sum += temp
            else:
                sum += d[value]
        return sum


    # 极致简洁版, 原：https://leetcode-cn.com/problems/roman-to-integer/solution/2-xing-python-on-by-knifezhu/

    # def romanToInt(self, s: str) -> int:
    #     d = {'I':1, 'IV':3, 'V':5, 'IX':8, 'X':10, 'XL':30, 'L':50, 'XC':80, 'C':100, 'CD':300, 'D':500, 'CM':800, 'M':1000}
    #     return sum(d.get(s[max(i-1, 0):i+1], d[n]) for i, n in enumerate(s))

