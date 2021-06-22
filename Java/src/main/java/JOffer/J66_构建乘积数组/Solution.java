package JOffer.J66_构建乘积数组;

/**
 * @author Aduner
 */
public class Solution {
    public int[] constructArr(int[] a) {
        if(a.length == 0) return new int[0];
        int[] result = new int[a.length];
        result[0] = 1;
        int temp = 1;
        for(int i = 1; i < a.length; i++) {
            result[i] = result[i - 1] * a[i - 1];
        }
        for(int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            result[i] *= temp;
        }
        return result;
    }
}