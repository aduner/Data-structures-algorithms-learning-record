# Link：https://leetcode-cn.com/problems/integer-to-roman/
class Solution:
    def intToRoman(self, num: int) -> str:
        d = {1: 'I', 4: 'IV', 5: 'V', 9: 'IX', 10: 'X', 40: 'XL', 50: 'L',
             90: 'XC', 100: 'C', 400: 'CD', 500: 'D', 900: 'CM', 1000: 'M'}
        k = list(d.keys())
        result=''
        for i in k[::-1]:
            if i<=num:
                result+=(num//i)*d[i]
                num = num % i
        return result

a=Solution()
b=a.intToRoman(58)
print(b)