package JOffer.J57_和为s的两个数字;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aduner
 */
public class Soluton {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int d = target - num;
            if (map.containsKey(num)) return new int[]{num, map.get(num)};
            else map.put(d, num);
        }
        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int s = nums[i] + nums[j];
            if (s < target) i++;
            else if (s > target) j--;
            else return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }
}
