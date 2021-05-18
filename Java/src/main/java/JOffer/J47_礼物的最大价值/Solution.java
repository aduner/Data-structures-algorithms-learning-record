package JOffer.J47_礼物的最大价值;

/**
 * @author Aduner
 */
public class Solution {
    public int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int topNum = i == 0 ? 0 : grid[i - 1][j];
                int leftNum = j == 0 ? 0 : grid[i][j - 1];
                grid[i][j] += topNum > leftNum ? topNum : leftNum;
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
