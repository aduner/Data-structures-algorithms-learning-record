class Solution:
    def permutation(self, s):
        s = list(s)
        result = []

        def dfs(index):
            if index == len(s) - 1:
                result.append(''.join(s))   # 添加排列方案
                return
            dic = set()
            for i in range(index, len(s)):
                if s[i] in dic:
                    continue
                dic.add(s[i])
                s[index], s[i] = s[i], s[index]
                dfs(index+1)
                s[index], s[i] = s[i], s[index]
        dfs(0)
        return result
