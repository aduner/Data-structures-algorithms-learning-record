package JOffer.J64_求1加到n;

/**
 * @author Aduner
 */
public class Solution {
    public int sumNums(int n) {
        boolean temp = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
