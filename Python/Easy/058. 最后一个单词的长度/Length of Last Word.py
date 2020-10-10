# Link: https://leetcode-cn.com/problems/length-of-last-word/submissions/
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.split()
        if len(s) == 0:
            return 0
        else:
            return len(s[-1])
