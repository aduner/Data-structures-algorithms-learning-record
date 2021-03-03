package JOffer.J05_替换空格;

import java.util.List;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.replaceSpace("hello world !"));
    }
}
