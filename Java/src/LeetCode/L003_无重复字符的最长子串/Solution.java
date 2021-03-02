package LeetCode.L003_无重复字符的最长子串;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet hashSet = new HashSet();
        int n = s.length();
        int r = -1, l = 0, result = 0;
        for (int i = 0; i < n; i++) {
            if(i!=0)
                hashSet.remove(s.charAt(i-1));
            while (r + 1 < n && !hashSet.contains(s.charAt(r+1))) {
                hashSet.add(s.charAt((r++)+1));
            }
            result=Math.max(result,r+1-i);
        }
        return result;
    }

}
