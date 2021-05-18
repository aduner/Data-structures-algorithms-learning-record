package JOffer.J48_最长不含重复字符的子字符串;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Aduner
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, temp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1);
            dic.put(s.charAt(j), j);
            temp = temp < j - i ? temp + 1 : j - i;
            res = Math.max(res, temp);
        }
        return res;
    }

    @Test
    void test() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
