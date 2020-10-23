# Link: https://leetcode-cn.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, s: str) -> bool: 
        s=''.join(e for e in s if e.isalnum()).lower()
        ss=''.join(reversed(s))
        return s==ss

