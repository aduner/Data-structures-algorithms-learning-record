package JOffer.J14_剪绳子;

/**
 * @author Aduner
 */
public class Solution {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    /**
     * 贪心算法
     * @param n
     * @return
     */
    public int cuttingRope2(int n) {
        if(n < 4){
            return n - 1;
        }
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return res * n;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));
    }
}

