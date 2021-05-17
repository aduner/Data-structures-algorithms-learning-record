package JOffer.J44_数字序列中某一位的数字;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    /**
     * 暴力法，超时
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        int num = n+1;
        int i=0;
        for (; i < n; i++) {
            int lenI = String.valueOf(i).length();
            if (num > lenI)
                num -= lenI;
            else
                break;
        }
        num--;
        String s = String.valueOf(i);
        char c= s.charAt(num);
        return c-'0';
    }

    /**
     * 推演法
     * @param n
     * @return
     */
    public int findNthDigit2(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit; // 2.
        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
    }

}
