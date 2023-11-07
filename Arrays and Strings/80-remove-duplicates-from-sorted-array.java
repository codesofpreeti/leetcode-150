class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int elem :nums){
            if(i==0||i==1||nums[i-2]!=elem){
                nums[i]=elem;
                i++;
            }
        }
        return i;
    }
}