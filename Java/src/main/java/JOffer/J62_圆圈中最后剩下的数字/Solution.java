package JOffer.J62_圆圈中最后剩下的数字;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Aduner
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        int result = 0;
        for (int i = 2; i != n + 1; ++i) {
            result = (m + result) % i;
        }
        return result;
    }
}
