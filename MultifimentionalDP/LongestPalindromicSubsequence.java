package MultifimentionalDP;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    int t[][]=new int[1001][1001];
    public String longestPalindrome(String s) {
        int n = s.length();

        for(int[] row: t){
            Arrays.fill(row,-1);
        }

        int maxLen = Integer.MIN_VALUE;
        int startIdx = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                if(solve(s,start,end)){
                    if(end-start+1>maxLen){
                        maxLen=end-start+1;
                        startIdx=start;
                    }
                }
            }
        }
        return s.substring(startIdx,startIdx+maxLen);
    }

    public boolean solve(String s, int start, int end) {
        if (start >= end)
            return true;

        if(t[start][end]!=-1) return t[start][end]==1;
        if (s.charAt(start) == s.charAt(end)) {
            if(solve(s, start + 1, end - 1)){
                t[start][end]=1;
                return true;
            }
        }
        return false;
    }
}
