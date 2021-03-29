package JOffer.J15_二进制中1的个数;

/**
 * @author Aduner
 */
public class Solution {
    public int hammingWeight(int n) {
        int result=0;
        while (n!=0){
            result+=n&1;
            n>>>=1;
        }
        return result;
    }
}
