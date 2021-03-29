package LeetCode.L008_字符串转换整数;

public class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        int index=0;
        while (index<len&&s.charAt(index)==' ')
            index++;
        if(index==len)
            return 0;
        int flag=1;
        if (s.charAt(index)=='-') {
            flag = -1;
            index++;
        }else if (s.charAt(index)=='+'){
            index++;
        }
        int result=0;
        while (index<len){
            char c=s.charAt(index++);
            if(c>'9' || c<'0')
                break;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (c - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && (c - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            result=result*10+flag*(c-'0');
        }
        return result;
    }
}
