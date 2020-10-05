# Link: https://leetcode-cn.com/problems/implement-strstr/
class Solution:
    # python内置方法
    # def strStr(self, haystack: str, needle: str) -> int:
    #     return haystack.find(needle)

    # split()提取
    # def strStr(self, haystack: str, needle: str) -> int:
    #     if needle not in haystack:
    #         return -1
    #     elif needle == '':
    #         return 0
    #     else:
    #         return len(haystack.split(needle)[0])

    # 暴力法
    # def strStr(self, haystack: str, needle: str) -> int:
    #     lh = len(haystack)
    #     ln = len(needle)
    #     for i in range(lh - ln + 1):
    #         if haystack[i:i + ln] == needle:
    #             return i
    #     else:
    #         return -1

    # Sunday解法 
    # Link: https: // leetcode-cn.com/problems/implement-strstr/solution/python3-sundayjie-fa-9996-by-tes/
    def strStr(self, haystack: str, needle: str) -> int:

        # Func: 计算偏移表
        def calShiftMat(st):
            dic = {}
            for i in range(len(st)-1, -1, -1):
                if not dic.get(st[i]):
                    dic[st[i]] = len(st)-i
            dic["ot"] = len(st)+1
            return dic

        # 其他情况判断
        if len(needle) > len(haystack):
            return -1
        if needle == "":
            return 0

        # 偏移表预处理
        dic = calShiftMat(needle)
        idx = 0

        while idx+len(needle) <= len(haystack):

            # 待匹配字符串
            str_cut = haystack[idx:idx+len(needle)]

            # 判断是否匹配
            if str_cut == needle:
                return idx
            else:
                # 边界处理
                if idx+len(needle) >= len(haystack):
                    return -1
                # 不匹配情况下，根据下一个字符的偏移，移动idx
                cur_c = haystack[idx+len(needle)]
                if dic.get(cur_c):
                    idx += dic[cur_c]
                else:
                    idx += dic["ot"]

        return -1 if idx+len(needle) >= len(haystack) else idx

