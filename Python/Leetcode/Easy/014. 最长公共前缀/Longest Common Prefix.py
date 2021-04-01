# Link: https://leetcode-cn.com/problems/longest-common-prefix/
class Solution(object):
    # zip方法，源：https://leetcode-cn.com/problems/longest-common-prefix/solution/shi-yong-zip-ji-xing-dai-ma-jian-dan-gao-ding-pyth/
    def longestCommonPrefix(self, strs):
        result = ""
        for i in zip(*strs):
            if len(set(i)) == 1:
                result += i[0]
            else:
                break
        return result