# Link: https://leetcode-cn.com/problems/palindrome-number/submissions/
class Solution:
    # Method 1
    # def isPalindrome(self, x: int) -> bool:
    #     return str(x) == str(x)[::-1]

    # Method 2
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        if x < 10:
            return True
        p = 0
        while x > p:
            p = p*10 + x % 10
            x //= 10
        return p == x or p//10 == x
