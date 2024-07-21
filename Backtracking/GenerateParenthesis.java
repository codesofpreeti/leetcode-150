package Backtracking;

import java.util.List;
List<String> ans;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        backTracking(n,"",0,0,ans);
        return ans;
    }
    public void backTracking(int n,String temp, int open, int close, List<String> ans ){
        if(temp.length()==n*2){
            ans.add(temp);
            return;
        }
        if(open<n){
            backTracking(n, temp+"(", open+1, close, ans);
        }
        if(close<open){
            backTracking(n, temp+")", open, close+1, ans);
        }
    }
}
