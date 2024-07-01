//leetcode 45
class Solution {

    public int jump(int[] nums){
        int steps=0;
        int lastJump=0;
        int coverage=0;
        int destination=nums.length-1;
        if(nums.length==1) return 0;
        for(int i=0;i<=destination;i++){
            coverage=Math.max(coverage,nums[i]+i);
            if(i==lastJump){
                lastJump=coverage;
                steps++;
                if(coverage>=destination){
                    return steps;
                }
            }
        }
        return steps;
    }
    // public int jump(int[] nums) {
    //     int res=0;
    //     int l=0, r=0;
    //     while(r<nums.length-1){
    //         int farthest=0;
    //         for(int i=l;i<=r;i++){
    //             farthest=Math.max(farthest,i+nums[i]);
    //         }
    //         l=r+1;
    //         r=farthest;
    //         res++;
    //     }
    //     return res;
    // }
}