package J11_旋转数组的最小数字;

/**
 * @author Aduner
 */
public class Solution {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length-1;
        while (left<right){
            int index=(right+left)/2;
            int v=numbers[index];
            if (v<numbers[left]) left=index+1;
            else if (v>numbers[right]) right=index;
            else right--;
        }
        return numbers[left];
    }
}

