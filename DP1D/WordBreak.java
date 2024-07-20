package DP1D;

import java.util.List;

public class WordBreak {
    Boolean t;
    int n;
    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        t=new Boolean[n];
        return solve(0,s,wordDict);
    }
    public boolean solve(int idx,String s, List<String> wordDict ){
        if(idx==n) return true;

        if(t[idx]!=null) return t[idx];

        for(int endIdx=idx+1; endIdx<n; endIdx++){
            String split=s.substring(idx,endIdx);
            if(wordDict.contains(split) && solve(endIdx,s,wordDict)){
               return t[idx]=true;
            }
        }
        return t[idx]=false;
    }
}
