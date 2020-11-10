# Link：https://leetcode-cn.com/problems/zigzag-conversion/

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        temp = ['' for i in range(numRows)]
        row = 0
        n = -1
        for i in s:
            temp[row] += i
            if row == 0 or row == numRows-1:
                n *= -1
            row += n
        result=''
        for i in temp:
            result+=''.join(i)
        return result
