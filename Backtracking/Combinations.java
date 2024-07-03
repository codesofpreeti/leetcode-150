package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        getAns(0,n,k,new ArrayList<>());
        return ans;
    }
    public void getAns(int start,int n int k,ArrayList<Integer> temp){
        if(k==0){
            ans.add(new ArrayList()<temp>);
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            getAns(i, n,k-1,temp);
            temp.remove(temp.size()-1);
        }
    }
    
}
