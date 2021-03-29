package LeetCode.L012_整数转罗马数字;

public class Solution {
    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        String result="";
        for(int i=0;i<values.length;i++){
            if(values[i]<=num){
                int n=num/values[i];
                num%=values[i];
                for(int j=0;j<n;j++){
                    result+=symbols[i];
                }
            }

        }
        return result;
    }
}