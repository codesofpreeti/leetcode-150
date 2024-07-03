package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        getAns(nums,ans,new ArrayList<>());
        return ans;

    }
    public void getAns(int nums[],List<List<Integer>> ans, ArrayList<Integer> temp){

        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            getAns(nums, ans, temp);
            temp.remove(temp.size()-1);
        }

    }
    
}
