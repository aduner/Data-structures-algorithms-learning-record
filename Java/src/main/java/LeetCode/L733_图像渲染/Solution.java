package LeetCode.L733_图像渲染;

/**
 * @author Aduner
 */
public class Solution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		return dfs(image, sr, sc, newColor, image[sr][sc]);
	}

	public int[][] dfs(int[][] image, int i, int j, int newColor, int oldColor){
		if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==newColor || image[i][j]!=oldColor){

		}else{
			int thisColor=image[i][j];
			image[i][j]=newColor;
			dfs(image, i+1, j, newColor, thisColor);
			dfs(image, i-1, j, newColor, thisColor);
			dfs(image, i, j+1, newColor, thisColor);
			dfs(image, i, j-1, newColor, thisColor);

		}
		return image;
	}
}
