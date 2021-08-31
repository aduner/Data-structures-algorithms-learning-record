package LeetCode.L557_反转字符串中的单词III;

/**
 * @author Aduner
 */
public class Solution {
	public String reverseWords(String s) {
		String[] ss= s.split(" ");
		StringBuilder res=new StringBuilder();
		for(String i:ss){
			res.append(reverseString(i.toCharArray()));
			res.append(" ");
		}
		return res.toString().trim();
	}

	private String reverseString(char[] s) {
		int l=0;
		int r=s.length-1;
		while (l<r){
			swap(s,l++,r--);
		}
		return String.valueOf(s);
	}
	private void swap(char[] s,int l,int r){
		char temp=s[l];
		s[l]=s[r];
		s[r]=temp;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().reverseWords("123 wqe"));
	}
}
