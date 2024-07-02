package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList();
        findCombi(0, candidates, target, res, new ArrayList<>());
        return res;

    }
    private void findCombi(int index,int[] candidates, int target,List<List<Integer>> res, List<Integer> ds){
        if(index==candidates.length) {
            if(target==0){
                res.add(new ArrayList<>(ds));
            }return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            findCombi(index, candidates, target-candidates[index], res, ds);
            ds.remove(ds.size()-1);
        }
        findCombi(index+1, candidates, target, res, ds);
    } 
}
