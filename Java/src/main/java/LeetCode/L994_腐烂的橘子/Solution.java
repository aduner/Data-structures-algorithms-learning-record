package LeetCode.L994_腐烂的橘子;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aduner
 */
public class Solution {
	public int orangesRotting(int[][] grid) {
		int M = grid.length;
		int N = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();
		// count 表示新鲜橘子的数量
		int count = 0;
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				if (grid[r][c] == 1) {
					count++;
				} else if (grid[r][c] == 2) {
					queue.add(new int[]{r, c});
				}
			}
		}
		// round 表示腐烂的轮数，或者分钟数
		int round = 0;
		while (count > 0 && !queue.isEmpty()) {
			round++;
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				int[] orange = queue.poll();
				int r = orange[0];
				int c = orange[1];
				if (r - 1 >= 0 && grid[r - 1][c] == 1) {
					grid[r - 1][c] = 2;
					count--;
					queue.add(new int[]{r - 1, c});
				}
				if (r + 1 < M && grid[r + 1][c] == 1) {
					grid[r + 1][c] = 2;
					count--;
					queue.add(new int[]{r + 1, c});
				}
				if (c - 1 >= 0 && grid[r][c - 1] == 1) {
					grid[r][c - 1] = 2;
					count--;
					queue.add(new int[]{r, c - 1});
				}
				if (c + 1 < N && grid[r][c + 1] == 1) {
					grid[r][c + 1] = 2;
					count--;
					queue.add(new int[]{r, c + 1});
				}
			}
		}

		if (count > 0) {
			return -1;
		} else {
			return round;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Solution().orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
		System.out.println(new Solution().orangesRotting(new int[][]{{0}}));
	}
}
