package Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int start=i;
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start!=i){
                ans.add(nums[start]+"->"+nums[i]);
            }
            else ans.add(Integer.toString(nums[start]));

        }
        return ans;
    }
}
