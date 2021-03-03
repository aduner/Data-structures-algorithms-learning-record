package JOffer.J04_二维数组中的查找;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int column = matrix[0].length - 1;
        while (matrix[row][column] != target) {
            if (target > matrix[row][column]) {
                row++;
                if (row == matrix.length){
                    return false;
                }
            }
            if(target < matrix[row][column]){
                column--;
                if(column==-1){
                    return false;
                }
            }
        }
        return true;
    }
}
