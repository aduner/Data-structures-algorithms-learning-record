package LeetCode.L010_正则表达式匹配;

public class Solution {
    private String s;
    private String p;
    public boolean isMatch(String s, String p) {
        this.s=s;
        this.p=p;
        return recur( 0, 0);
    }

    public boolean recur(int i, int j) {
        int sLen = s.length();
        int pLen = p.length();

        if (j == pLen)
            return i == s.length();
        boolean first_match = (sLen > i) && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');

        if (pLen >= j + 2 && p.charAt(j + 1) == '*')
            return recur(i, j + 2) || (first_match && recur(i + 1, j));
        return first_match && recur (i + 1, j + 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aa", "a"));
    }
}
