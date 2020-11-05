# Link：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # 哈希集合，记录每个字符是否出现过
        occ = set()
        n = len(s)
        # 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        rk, ans = -1, 0
        for i in range(n):
            if i != 0:
                # 左指针向右移动一格，移除一个字符
                occ.remove(s[i - 1])
            while rk + 1 < n and s[rk + 1] not in occ:
                # 不断地移动右指针
                occ.add(s[rk + 1])
                rk += 1
            # 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = max(ans, rk - i + 1)
        return ans

    # def lengthOfLongestSubstring(self, s: str) -> int:
    #     result = ''
    #     temp = ''
    #     for i in s:
    #         # 遍历，若不重复则记录该字符
    #         if i not in temp:
    #             temp += i
    #         # 如果遇到了已经存在的字符，则找到该字符所在位置，删除该字符，并保留该位置之后的子串，并把当前字符加入到最后，完成更新
    #         else:
    #             temp = temp[temp.index(i)+1:]
    #             temp += i
    #         # 如果是当前最长的，就替换掉之前存储的最长子串
    #         if len(temp) > len(result):
    #             result = temp
    #     return len(result)
