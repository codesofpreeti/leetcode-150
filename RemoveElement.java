//leetcode 27
class Solution {
    public int removeElement(int[] nums, int val) {
        int nonVal=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[nonVal]=nums[i];
                nonVal++;
            }
        }
        return nonVal;
    }
}

//two pointer approach