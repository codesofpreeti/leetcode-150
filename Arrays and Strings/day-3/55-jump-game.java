class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length-1;
        int goal=l-2;
        for(int i=l;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;

    }
}