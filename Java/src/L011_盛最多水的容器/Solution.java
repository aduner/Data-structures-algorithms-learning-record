package L011_盛最多水的容器;

public class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int width=height.length-1;
        int area=0;
        while (l<r){
            int leftHeight=height[l];
            int rightHeight=height[r];
            area=Math.max(width*(Math.min(leftHeight, rightHeight)),area);
            if(leftHeight>rightHeight)
                r--;
            else
                l++;
            width--;
        }
        return area;
    }
}
