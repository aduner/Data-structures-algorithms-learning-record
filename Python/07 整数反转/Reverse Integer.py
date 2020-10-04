# Link: https://leetcode-cn.com/problems/reverse-integer/
class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            x = abs(x)
            flag = -1
        else:
            flag = 1
        y = str(x)
        x = ''
        for i in y:
            x = i+x
        x = flag*int(x)
        # if x < -2**31 or x > 2**31-1:
        if x < (-1 << 31) or x > (1 << 31)-1:
            return 0
        return x
