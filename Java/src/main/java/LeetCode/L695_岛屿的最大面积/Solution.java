package LeetCode.L695_岛屿的最大面积;

/**
 * @author Aduner
 */
public class Solution {
	public int maxAreaOfIsland(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					result = Math.max(result, dfs(grid, i, j));
				}
			}
		}
		return result;
	}

	private int dfs(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
			return 0;
		} else {
			grid[i][j] = 0;
			return dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1) + 1;
		}
	}
}
