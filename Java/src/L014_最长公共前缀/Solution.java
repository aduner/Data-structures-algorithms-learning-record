package L014_最长公共前缀;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String s : strs) {
            prefix = getPrefix(prefix, s);
            if(prefix.length()==0){
                break;
            }
        }
        return prefix;
    }


    public String getPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        for (; index < length && str1.charAt(index) == str2.charAt(index); index++) ;
        return str1.substring(0, index);
    }
}
