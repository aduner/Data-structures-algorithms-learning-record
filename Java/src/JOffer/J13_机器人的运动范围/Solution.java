package JOffer.J13_机器人的运动范围;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aduner
 */
public class Solution {
    private int m, n, k;
    private boolean[][] matrix;

    /**
     * DFS
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        if(k==0) return 1;
        this.m = m;
        this.n = n;
        this.k = k;
        this.matrix = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    private int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || si + sj > k || matrix[i][j]) return 0;
        matrix[i][j] = true;
        return 1 + dfs(i + 1, j, sumDigital(i,si), sj) + dfs(i, j + 1, si, sumDigital(j,sj));
    }

    private int sumDigital(int n,int num) {
        return (n+1) % 10 != 0 ? num+1 : num - 8;
    }

    public static void main(String[] args) {
        var s=new Solution();
        System.out.println(s.movingCount(7, 2, 3));
    }

    /**
     * BFS
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int bfs(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue= new LinkedList<int[]>();
        queue.add(new int[] { 0, 0, 0, 0 });
        while(queue.size() > 0) {
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if(i >= m || j >= n || k < si + sj || visited[i][j]) continue;
            visited[i][j] = true;
            res ++;
            queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
        }
        return res;
    }

}
