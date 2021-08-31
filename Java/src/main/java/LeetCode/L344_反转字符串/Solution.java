package LeetCode.L344_反转字符串;

/**
 * @author Aduner
 */
public class Solution {
	public void reverseString(char[] s) {
		int l=0;
		int r=s.length-1;
		while (l<r){
			swap(s,l++,r--);
		}
	}
	private void swap(char[] s,int l,int r){
		char temp=s[l];
		s[l]=s[r];
		s[r]=temp;
	}
}
