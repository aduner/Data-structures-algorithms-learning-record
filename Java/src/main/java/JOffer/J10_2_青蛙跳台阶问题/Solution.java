package JOffer.J10_2_青蛙跳台阶问题;

/**
 * 跟上一题没本质区别，都是考察斐波那切问题
 * @author Aduner
 */
public class Solution {
    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        int one = 1;
        int two = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (one + two) % 1000000007;
            one = two;
            two = result;
        }
        return result;
    }
}
