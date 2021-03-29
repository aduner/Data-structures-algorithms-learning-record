package JOffer.J10_1_斐波那契数列;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aduner
 */
public class Solution {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    /**
     * 递归，效率太低
     * @param n
     * @return
     */
    public int fib_(int n) {
        if (n == 0 || n == 1) return n;
        return fib_(n - 1) + fib_(n - 2);
    }

    /**
     * 使用map记录一下的递归法，效率起飞
     * 缺点需要额外的空间
     * @param n
     * @return
     */
    public int fib__(int n) {
        if (n == 0 || n == 1) return n;
        if (!map.containsKey(n)) map.put(n, (fib__(n - 1) + fib__(n - 2)) % 1000000007);
        return map.get(n);
    }

    /**
     * 迭代法
     * 动态规划
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int one = 0;
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
