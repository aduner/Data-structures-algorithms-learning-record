# Link: https://leetcode-cn.com/problems/longest-common-prefix/
class Solution(object):
    # 常规方法
    # def longestCommonPrefix(self, strs):
    #     if not strs: 
    #         return ""
    #     min_str = min(strs)
    #     max_str = max(strs)
    #     for i in range(len(min_str)):
    #         if min_str[i] != max_str[i]:
    #             return min_str[:i]
    #     return max_str

    # zip方法，源：https://leetcode-cn.com/problems/longest-common-prefix/solution/shi-yong-zip-ji-xing-dai-ma-jian-dan-gao-ding-pyth/
    def longestCommonPrefix(self, strs):
        result = ""
        for i in zip(*strs):
            if len(set(i)) == 1:
                result += i[0]
            else:
                break
        return result

