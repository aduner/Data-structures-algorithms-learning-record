package LeetCode.L006_Z字形变换;

public class Solution {

    public String convert(String s, int numRows) {
        if(s.length()<2||numRows==1)
            return s;
        String[] str = new String[numRows];
        int row=0;
        int n=-1;
        for(int i=0;i<s.length();i++){
            if(str[row]==null)
                str[row]="";
            str[row]+=s.charAt(i);
            if(row==0||row==numRows-1)
                n*=-1;
            row+=n;
        }
        String result="";
        for(String i:str){
            if(i!=null)
                result+=i;
        }
        return result;
    }
}
