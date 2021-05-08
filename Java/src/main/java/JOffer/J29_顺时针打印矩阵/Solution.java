package JOffer.J29_顺时针打印矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aduner
 */
public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];
        while (true) {
            for (int i = left; i <= right; i++)
                res[x++] = matrix[top][i];
            if (++top > bottom)
                break;

            for (int i = top; i <= bottom; i++)
                res[x++] = matrix[i][right];
            if (left > --right)
                break;

            for (int i = right; i >= left; i--)
                res[x++] = matrix[bottom][i];
            if (top > --bottom)
                break;

            for (int i = bottom; i >= top; i--)
                res[x++] = matrix[i][left];
            if (++left > right)
                break;
        }
        return res;
    }
}

