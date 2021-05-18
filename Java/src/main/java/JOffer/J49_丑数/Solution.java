package JOffer.J49_丑数;

/**
 * @author Aduner
 */
public class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        int two = 1, three = 1, five = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = res[two] * 2;
            int num3 = res[three] * 3;
            int num5 = res[five] * 5;
            res[i] = Math.min(Math.min(num2, num3), num5);
            if (res[i] == num2) {
                two++;
            }
            if (res[i] == num3) {
                three++;
            }
            if (res[i] == num5) {
                five++;
            }
        }
        return res[n];
    }
}
