package LeetCode.L077_组合;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Aduner
 */
public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		if (k <= 0 || n < k) {
			return res;
		}
		Deque<Integer> path = new ArrayDeque<>();
		dfs(n, k, 1, path, res);
		return res;
	}

	private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
		if (path.size() == k) {
			res.add(new ArrayList<>(path));
			return;
		}

		for (int i = begin; i <= n; i++) {
			path.addLast(i);
			dfs(n, k, i + 1, path, res);
			path.removeLast();
		}
	}

	public static void main(String[] args) {
		new Solution().combine(4,3);
	}

}
