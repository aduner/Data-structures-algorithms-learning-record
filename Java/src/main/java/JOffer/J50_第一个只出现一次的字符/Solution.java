package JOffer.J50_第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aduner
 */
public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int temp = map.getOrDefault(c, 0);
            map.put(c, temp + 1);
        }
        for (char c : s.toCharArray()) {
            if(map.get(c)==1)
                return c;
        }
        return ' ';
    }
}