# Link: https://leetcode-cn.com/problems/add-binary/
class Solution:
    # python赖皮法
    # def addBinary(self, a: str, b: str) -> str:
    #     return bin(int(a, 2) + int(b, 2))[2:]

    # 递归
    def addBinary(self, a: str, b: str) -> str:
        if a == '':
            return b
        if b == '':
            return a
        if a[-1] == '1' and b[-1] == '1':
            return self.addBinary(self.addBinary(a[:-1], b[:-1]), '1')+'0'
        elif a[-1] == '0' and b[-1] == '0':
            return self.addBinary(a[:-1], b[:-1])+'0'
        else:
            return self.addBinary(a[:-1], b[:-1])+'1'
