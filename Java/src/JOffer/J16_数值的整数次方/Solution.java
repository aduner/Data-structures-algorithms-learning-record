package JOffer.J16_数值的整数次方;

/**
 * @author Aduner
 */
public class Solution {
    public double myPow(double x, int n) {
        switch (n){
            case 0:return 1;
            case 1:return x;
            case -1:return 1/x;
        }
        double result=myPow(x,n>>1);
        result*=result;
        if((n&0b1)==1){
            result*=x;
        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.000, -2));
    }
}
