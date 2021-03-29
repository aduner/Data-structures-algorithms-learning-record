package JOffer.J19_正则表达式匹配;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public boolean isMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
//        字符串为空时，正则串为空必错，如果为偶数需要偶数位为*
        if (lenA == 0) {
            if (lenB % 2 == 1) return false;
            for (int i = 1; i < lenB; i += 2) {
                if (B.charAt(i) != '*') return false;
            }
            return true;
        }
//        字符串不为空，正则串一定不能为空
        if (lenB == 0) return false;
        char ac1 = A.charAt(0);
        char bc1 = B.charAt(0);
        char bc2 = '1'; //正则串的后一位，用来判断是否有 *
        if (lenB > 1) {
            bc2 = B.charAt(1);
        }
//        分有*和无*两种情况
        if (bc2 != '*') {
            if (ac1 == bc1 || bc1 == '.') {
                return isMatch(A.substring(1), B.substring(1));
            } else return false;
        }else{//没有*的时候有两种情况，看*和不看
            if(ac1==bc1||bc1=='.'){
                return isMatch(A.substring(1),B)||isMatch(A,B.substring(2));
            }else{
                return isMatch(A,B.substring(2));
            }
        }
    }
    public boolean isMatch2(String A, String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] f = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //分成空正则和非空正则两种
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    //非空正则分为两种情况 * 和 非*
                    if (B.charAt(j - 1) != '*') {
                        if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 了，分为看和不看两种情况
                        //不看
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //看
                        if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }

    @Test
    public void test() {
        String s = "aa";
        String p = "a";
        System.out.println(isMatch(s, p));
    }
}
