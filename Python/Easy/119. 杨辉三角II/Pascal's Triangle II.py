# Link:https://leetcode-cn.com/problems/pascals-triangle-ii/

class Solution:
    def getRow(self, rowIndex):
        row = [1]
        for i in range(1, rowIndex + 1):
            row.insert(0, 0)
            for j in range(i):
                row[j] = row[j] + row[j+1]
        return row
