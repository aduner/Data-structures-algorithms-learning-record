package LeetCode.L120_三角形最小路径和;

import java.util.List;

/**
 * @author Aduner
 */
class Solution {
	Integer[][] memo;
	public int minimumTotal(List<List<Integer>> triangle) {
		memo = new Integer[triangle.size()][triangle.size()];
		return  dfs(triangle, 0, 0);
	}

	private int dfs(List<List<Integer>> triangle, int i, int j) {
		if (i == triangle.size()) {
			return 0;
		}
		if (memo[i][j] != null) {
			return memo[i][j];
		}
		return memo[i][j] = Math.min(dfs(triangle, i + 1, j), dfs(triangle, i + 1, j + 1)) + triangle.get(i).get(j);
	}
}
